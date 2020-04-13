package multiligual_pages;

import org.openqa.selenium.WebDriver;

public class SignUpPage extends CommonPage{

	
	String UserEmail="manir@gmail.com";
	String UserName="Manir";
	String UserPassword="1234";
	String UserCnfPassword="1234";
	String UserFirstName="Manir";
	String UserLastName="Hossain";
	String UserAddress="Manir";
	String EmailLink_Label="{xpath://*[@id=\"txtEmail\"]";
	String FullNameLink_Label="{xpath://*[@id=\"txtUserName\"]";
	String PasswordLink_Label="{xpath://*[@id=\"txtPassword\"]";
	String CnfPasswordLink_Label="{xpath://*[@id=\"txtCnfPassword\"]";
	String FirstNameLink_Label="{xpath://*[@id=\"txtFirstName\"]";
	String LastNameLink_Label="{xpath://*[@id=\"txtLastName\"]";
	String AddressLink_Label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[7]/input";
	String CraeteBtnLink_Label="{xpath://*[@id=\"btnRegister\"]";
	String UserRegistration_label="{xpath://*[@id=\"items_top_area\"]";
	String NewsPed_Link_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[8]/input";
	String forgot_Pasword_label="{xpath://*[@id=\"item_details\"]/div[2]/div[4]/div/div[1]/div[10]/div/div/a";

	
	public SignUpPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}
	public boolean finderRegistrationInSignUpPage()  {
		// TODO Auto-generated method stub
//		uglyWaitFor(12000);
		return isDisplayOperation(getWebElementByOperation(UserRegistration_label));
  }
	public void singUpCompleteWith(String textToBeWrite) {
		
		// TODO Auto-generated method stub
		 typeOperation(getWebElementByOperation(EmailLink_Label),UserEmail);
		 typeOperation(getWebElementByOperation(FullNameLink_Label),UserName);
		 typeOperation(getWebElementByOperation(PasswordLink_Label),UserPassword);
		 typeOperation(getWebElementByOperation(CnfPasswordLink_Label),UserCnfPassword);
		 typeOperation(getWebElementByOperation(FirstNameLink_Label),UserFirstName);
		 typeOperation(getWebElementByOperation(LastNameLink_Label),UserLastName);
		 typeOperation(getWebElementByOperation(AddressLink_Label),UserAddress);

		clickOperation(getWebElementByOperation(CraeteBtnLink_Label));
	}
    public void uncheckNewsPed() {

//	uglyWaitFor(12000);
	clickOperation(getWebElementByOperation(NewsPed_Link_label));
	
}
     public void gotoforgotpasswordpage() {
//	 uglyWaitFor(12000);
	 clickOperation(getWebElementByOperation(forgot_Pasword_label));
}
}
