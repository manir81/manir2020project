package step_definitions_Miltilingual;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import multiligual_pages.SignUpPage;

public class Steps_SignUp {

	All_Steps_Need testHelper;
	public  Steps_SignUp (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	@Then("^I want to Check User Registration available in SignUp page$")
	public void i_want_to_Check_User_Registration_available_in_SignUp_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();

		testHelper.signuppage=new SignUpPage(testHelper.driver);
     boolean actuatRegis=testHelper.signuppage.finderRegistrationInSignUpPage();
       System.out.println("found User Registration:"+actuatRegis);
       Assert.assertEquals("Failed not found",true, actuatRegis);
       
	}
    	
	@When("^I want to succefull Sign Up$")
	public void i_want_to_succefull_Sign_Up()  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 //throw new PendingException();

		testHelper.signuppage.singUpCompleteWith(null);
		System.out.println("successfully Sign_up is complete");
	}
	@Then("^I want to Uncheck News Peds$")
	public void i_want_to_Uncheck_News_Peds() throws Throwable  {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		testHelper.signuppage=new SignUpPage(testHelper.driver);
		testHelper.signuppage.uncheckNewsPed();
		System.out.println("successfully clickon NewsPed");
	}

	@And("^I want to click on forgot button$")
	public void i_want_to_click_on_forgot_button() throws Throwable  {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();

		testHelper.signuppage.gotoforgotpasswordpage();
		System.out.println("click on forgot password");
	}

}
