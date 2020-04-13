package multiligual_pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPage{

	String LoginLink_Label="{xpath://*[@id=\"dLabellogin\"]/span";
	String SignUpLink_Label="{xpath://*[@id=\"jqSignup\"]";
	String NameLink_Label="{xpath://*[@id=\"username\"]";
	String PasswordLink_Label="{xpath://*[@id=\"password\"]";
	String LogLink_Label2="{xpath://*[@id=\"jqLogin\"]";
	String ProfileLink_Label="{xpath://*[@id=\"dLabel\"]/span";
	String UserAccountLink_Label="{xpath://*[@id=\"drp_div\"]/ul/li/div/div[1]/a";
	String proUserIcon_Label="{xpath://*[@id=\"dLabel\"]/i";
	String EnterUserName_label="{xpath://*[@id=\"name_error\"]";
	String EnterPassword_label="{xpath://*[@id=\"password_error\"]";
	//*[@id="name_error"]
	//*[@id="jqLogin"]
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);

	}

public void goToHomePage() {
	// TODO Auto-generated method stub
	driver.get("https://www.demo.iscripts.com/multicart/demo/");
}
	public SignUpPage navigateToSignUpPage() {
		// TODO Auto-generated method stub
		uglyWaitFor(6000); 
		clickOperation(getWebElementByOperation(LoginLink_Label));
	    uglyWaitFor(6000); 
	    clickOperation(getWebElementByOperation(SignUpLink_Label));
	    return new SignUpPage(this.driver);
	    }	

	public void dologinwith( String id, String password) {
		uglyWaitFor(6000); 
		 clickOperation(getWebElementByOperation(LoginLink_Label));
		 uglyWaitFor(6000);
		 typeOperation(getWebElementByOperation(NameLink_Label),id);
		 uglyWaitFor(6000);
		 typeOperation(getWebElementByOperation(PasswordLink_Label),password);
		 uglyWaitFor(6000);
		 clickOperation(getWebElementByOperation(LogLink_Label2));
		
		}
	
    public boolean findProNameInHomePage() {
		// TODO Auto-generated method stub
    	
	     uglyWaitFor(6000);
	return isDisplayOperation(getWebElementByOperation(ProfileLink_Label));
		}
	
    public MyAccountPage navigateToMyAccountPage() {
	     uglyWaitFor(6000);
		clickOperation(getWebElementByOperation(proUserIcon_Label));
		   uglyWaitFor(6000);
		clickOperation(getWebElementByOperation(UserAccountLink_Label));
		return new MyAccountPage(this.driver);
	}

    public boolean findPasswordErrorInHomePage() {
	// TODO Auto-generated method stub
	uglyWaitFor(6000);
	return isDisplayOperation(getWebElementByOperation(EnterPassword_label));
}

    public boolean IdErrorInHomePage() {
	// TODO Auto-generated method stub
	uglyWaitFor(6000);
	return isDisplayOperation(getWebElementByOperation(EnterUserName_label));
}

}
