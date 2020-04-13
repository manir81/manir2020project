package multiligual_pages;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

    public class CommonPage {
	WebDriver driver;
	
		
   public CommonPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
   
   
// this method are using to click WebElements 
    public void clickOperation(WebElement elementBy){
    	elementBy.click();

	}
 // this method are using to Type in  WebElement 
    public void typeOperation(WebElement elementBy, String textToBeWrite) {
    	elementBy.sendKeys(textToBeWrite);

	}

	public void selectItemFromDropDown(WebElement targetWebElement, String itemToSelect) {
		Select selectElement = new Select(targetWebElement);
		selectElement.selectByVisibleText(itemToSelect);
	}
 // this method are using to get Text Back WebElements 
    public String getTextBackOperation(WebElement elementBy) {
    	try{
    		return elementBy.getText();
            }catch(Exception e) {
    	       e.printStackTrace();
    	       }return null;
    	

	}
 // this method are using to Display/availability of WebElement 
    public boolean isDisplayOperation(WebElement elementBy) {
     try{
    	return elementBy.isDisplayed();
        }catch(Exception e) {
	       e.printStackTrace();
	        return false;
	}

	}
 // this method are using to Count  WebElements 
	public boolean CountOperation(String locator) {
	 try {
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement>allfriendElement=driver.findElements(By.xpath(locator.split(":")[1]));
	System.out.println("Table:"+allfriendElement.size());
	 if(allfriendElement.size()>0){
	   return true;}
          }catch(Exception e){
	        e.printStackTrace();
            }
              return false;	
         }
	// this method are using FindWebElementBy .
	public WebElement getWebElementByOperation(String locator) {
		WebElement tempwebelement=null;
		if(locator.contains("{name")) {
			tempwebelement=driver.findElement(By.name(locator.split(":")[1]));
		}else if(locator.contains("{xpath")) {
			tempwebelement=driver.findElement(By.xpath(locator.split(":")[1]));
		}else if(locator.contains("{id")) {
			tempwebelement=driver.findElement(By.id(locator.split(":")[1]));
		} else if(locator.contains("{cssSelector")) {
			tempwebelement=driver.findElement(By.cssSelector(locator.split(":")[1]));
			}
		highLightElementsBorder(locator,"pass");
		return  tempwebelement;
		}
// this method are using to get more then one(1<more) WebElements at a time
	public List<WebElement>listWebElementsOperation(String locator) {
		List<WebElement> webelements=null;
		if(locator.contains("{name")) {
			webelements=driver.findElements(By.name(locator.split(":")[1]));
		}else if(locator.contains("{xpath")) {
			webelements=driver.findElements(By.xpath(locator.split(":")[1]));
		}else if(locator.contains("{id")) {
			webelements=driver.findElements(By.id(locator.split(":")[1]));
		} else if(locator.contains("{cssSelector")) {
			webelements=driver.findElements(By.cssSelector(locator.split(":")[1]));
			}
		highLightElementsBorder(locator,"pass");
		return  webelements;
		}
	// this method are using to get table of WebElements at a time
	public List<String> getElementTableOperation(List<WebElement> webelements) {
		List<String>tempReturn=new ArrayList<String>();
		try {
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    System.out.println("Table:"+webelements.size());
	for(int i=0;i<tempReturn.size();i++) {
		tempReturn.add(webelements.get(i).getText());
	}
	}catch(Exception e){
	        e.printStackTrace();
            }
		return tempReturn;
         }
	
/* **********Helper Methods***********/
	
/* **********Wait Time Method***********/
    public void uglyWaitFor(int mls) {
	try {
	Thread.sleep(mls);
       } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	     e.printStackTrace();
         }
          }
/* **********Replace Locators Method***********/

    public String replacelocatorsWith(String locatorstring, String ReplaceCharacters) {
	if(locatorstring.equals("${xxRPCLXX}")) {
	return locatorstring.replace("${xxRPCLXX}", ReplaceCharacters);
}else {
	return locatorstring;}
}

/* **********HighLight Elements BackGround Method***********/
    public  void highLightElementsBorder(String locator, String flag) {
	JavascriptExecutor js = (JavascriptExecutor)driver; 

	WebElement element=null;
	if(locator.contains("{name")) {

		 element=driver.findElement(By.name(locator.split(":")[1]));
	}else if(locator.contains("{xpath")) {

		 element=driver.findElement(By.xpath(locator.split(":")[1]));
	}else if(locator.contains("{id")) {
		element=driver.findElement(By.id(locator.split(":")[1]));

		}
	if(flag.equalsIgnoreCase("pass")) {
		js.executeScript("arguments[0].setAttribute('style','border: solid 2px Yellow');",element);
	}else {
		
	js.executeScript("arguments[0].setAttribute('style','border: solid 2px Red');",element);
	uglyWaitFor(4000);
	}
	uglyWaitFor(2000);
}
    
    public void highlightElement(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (flag.equalsIgnoreCase("pass")) {
			js.executeScript("arguments[0].style.border='2px groove green'", element);
		} else {
			js.executeScript("arguments[0].style.border='2px solid red'", element);

		}
		uglyWaitFor(2000);
	}

	public void highlightElementBackground(WebElement element, String flag) {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		if (flag.equalsIgnoreCase("pass")) {
			// js.executeScript("arguments[0].style.border='1px groove green'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "yellow" + "'", element);
		} else {
			// js.executeScript("arguments[0].style.border='4px solid red'", element);
			js.executeScript("arguments[0].style.backgroundColor = '" + "red" + "'", element);
		}

		uglyWaitFor(500);
	}

    
    }
    