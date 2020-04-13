package step_definitions_Miltilingual;

import cucumber.api.java.en.Then;
import multiligual_pages.OrderPage;

public class Steps_Order {

	All_Steps_Need testHelper;
	public  Steps_Order (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	@Then("^check Order in the left side$")
	public void check_Order_in_the_left_side() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		testHelper.orderpage= new OrderPage(testHelper.driver);
		testHelper.getOrderpage().findOrderInOrderPage();
		System.out.println("successfully found Order ");
	}

	
	   @Then("^I want to check order TABLE there or not$")
	   public void i_want_to_check_order_TABLE_there_or_not() throws Throwable {
	       // Write code here that turns the phrase above into concrete actions
	       //throw new PendingException();
		   testHelper.getOrderpage().getOderTableInOderPage();
			System.out.println("successfully get TABLE_there_or_not");
	   }

}
