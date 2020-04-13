package multilingual_cart_Hook;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import multilingual_User.User;
import step_definitions_Miltilingual.All_Steps_Need;

public class Steps_Hook {
	All_Steps_Need testHelper;
	public  Steps_Hook (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
//	hook Before And After
	@Before
	public void beforeScensrioStart() {
		System.out.println(" ****** BeforeScenario ********");
		testHelper.getManir().setID("user");
		testHelper.getManir().setPassword("pass");
		testHelper.getManir().setProfileName("JAMES WILLIAMS");
	}

	@After
	public void afterScensrioSEnd() {
		System.out.println(" ****** AfterScenario ********");
		testHelper.getDriver().close();
		
	
	}


}
