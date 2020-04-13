package step_definitions_Miltilingual;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import multiligual_pages.HomePage;

public class Steps_SignIn {

	All_Steps_Need testHelper;
	public  Steps_SignIn (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	@When("^I want to Sign In with valid credintial$")
	public void i_want_to_Sign_In_with_valid_credintial() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		testHelper.homepage=new HomePage(testHelper.driver);
		testHelper.getHomepage().dologinwith(testHelper.Manir.getID(),testHelper.Manir.getPassword());
		System.out.println("successfully Sign_In complete");
		}

	@Then("^I Expected JAMES WILLIAMS in the profile Name$")
	public void i_Expected_JAMES_WILLIAMS_in_the_profile_Name()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		testHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	boolean  actualproName= testHelper.homepage.findProNameInHomePage();
	   System.out.println("found profileName:"+actualproName);
	   Assert.assertEquals("Failed", true, actualproName);
		}
	@Then("^I want to Navigate to Sign up Page$")
	public void i_want_to_Navigate_to_Sign_up_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		testHelper.homepage=new HomePage(testHelper.driver);
		testHelper.getHomepage().navigateToSignUpPage();
		System.out.println("successfully Navigate_to_Sign_up_Page");
	}

		@And("^I want to Navigate to My Account Page$")
	public void i_want_to_Navigate_to_My_Account_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
			testHelper.homepage=new HomePage(testHelper.driver);
			testHelper.getHomepage().navigateToMyAccountPage();
		   System.out.println("successfully Navigate_to_My_Account_Page");
	}
       @When("^I want to Sign In with Invalid ID$")
		public void i_want_to_Sign_In_with_Invalid_ID() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
			testHelper.homepage=new HomePage(testHelper.driver);
			testHelper.getHomepage().dologinwith("",testHelper.Manir.getPassword());
// don't keep any gap between ""(quotation).Otherwise test going to fail.			
			System.out.println(" Sign_In Incomplete with out UserName");
		}

		@Then("^I Expected to see Enter id$")
		public void i_Expected_to_see_Enter_id() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
			testHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			boolean  actualEnterId= testHelper.homepage.IdErrorInHomePage();
			   System.out.println("found profileName:"+actualEnterId);
			   Assert.assertEquals("Failed", true, actualEnterId);
			   
		}
       @When("^I want to Sign In with Invalid password$")
		public void i_want_to_Sign_In_with_Invalid_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
			testHelper.homepage=new HomePage(testHelper.driver);
			testHelper.getHomepage().dologinwith(testHelper.Manir.getID(),"");
			System.out.println(" Sign_In Incomplete with out password");
		}

		@Then("^I Expected to see Enter password$")
		public void i_Expected_to_see_Enter_password() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
//		    throw new PendingException();
			testHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			boolean  actualEnterPassword=testHelper.homepage.findPasswordErrorInHomePage();
			   System.out.println("found profileName:"+actualEnterPassword);
			   Assert.assertEquals("Failed", true, actualEnterPassword);
		}

	
		
}
