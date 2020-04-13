package multiligual_pages;

import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class OrderPage extends CommonPage{
	//WebDriver driver;
	//*[@id="item_details"]/div[3]/div[1]/div/div[1]/a
	//*[@id="item_details"]/div[3]/div[1]/div/div[1]/div[1]/a/img
	//*[@id="wrapper"]/div[2]/div[1]/div[1]/div/h1
String orderLink_label="{xpath://*[@id=\"wrapper\"]/div[2]/div[1]/div[1]/div/h1";
String orderTable_label="{xpath://table[@class='table table-bordered oder_table']//tbody";	

public OrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	super(driver);
	}

	public boolean findOrderInOrderPage() {
		// TODO Auto-generated method stub
		   uglyWaitFor(12000);
		return isDisplayOperation(getWebElementByOperation(orderLink_label));
		  
	}
   public boolean getOderTableInOderPage() {
	   uglyWaitFor(6000);
	   return CountOperation(orderTable_label);
	} 
}
