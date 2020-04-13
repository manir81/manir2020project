package step_definitions_Miltilingual;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Steps_Common {

	All_Steps_Need testHelper;
	
	public  Steps_Common (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	
	@Given("^I want to open a chrome Browser$")
	public void i_want_to_open_a_chrome_Browser()  {
	    // Write code here that turns the phrase above into concrete actions
		//throw new PendingException();
        testHelper.getDriver();
		System.out.println("Browser has been opened");
	}

	@And("^I want navigate URL Multiligual cart$")
	
    public void i_want_navigate_URL_Multiligual_cart()  {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		testHelper.getHomepage().goToHomePage();
		System.out.println("succefully navigate to url");
	}

}
