package step_definitions_Miltilingual;

import cucumber.api.java.en.Then;

public class Steps_PasswordChange {
All_Steps_Need testHelper;
	
	public  Steps_PasswordChange (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	@Then("^I Want to Navigate to Change Password page$")
	public void i_Want_to_Navigate_to_Change_Password_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		testHelper.getMyaccountpage().navigateToPasswordChangePage();
	System.out.println(" Successfully Navigate to password change page");
	}
	@Then("^I want to Change password$")
	public void i_want_to_Change_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
     testHelper.getChangePasswordPage().changePasswordBy();
		System.out.println(" Successfully Changed password  in password change page");
		
	}

}
