package multiligual_pages;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends CommonPage{

String MyOderLink_label="{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[1]/a";
String myAccountListLink_label="{xpath://div[@class='myaccount_list']//div[@class='col-sm-12 col-lg-3 col-md-3']/a";
String passwrdChange_label="{xpath://*[@id=\"item_details\"]/div[3]/div[1]/div/div[4]/a";
    public MyAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
     super(driver);
     }

	public OrderPage navigateToOrderPage() {
		// TODO Auto-generated method stub
//	uglyWaitFor(6000);
    clickOperation(getWebElementByOperation(MyOderLink_label));
     return new OrderPage(this.driver);
	}
       public List<String>getAllDataIntable() {
	// TODO Auto-generated method stub
//	uglyWaitFor(6000);
	return getElementTableOperation(listWebElementsOperation(myAccountListLink_label));
}
       public  ChangePasswordPage navigateToPasswordChangePage() {
//    	   uglyWaitFor(6000);
    	   clickOperation(getWebElementByOperation(passwrdChange_label));
    	   return new ChangePasswordPage(this.driver);
       }
}
