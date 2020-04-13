package step_definitions_Miltilingual;

import java.util.List;

import org.junit.Assert;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import multiligual_pages.MyAccountPage;

public class Steps_MyAccount {
	
	All_Steps_Need testHelper;
	
	public  Steps_MyAccount (All_Steps_Need testHelper) {
		this.testHelper=testHelper;
	}
	
	
	
	@Then("^I want to I Navigate to Order Page$")
	public void i_want_to_I_Navigate_to_Order_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new PendingException();
		testHelper.myaccountpage= new MyAccountPage(testHelper.driver);
		testHelper.myaccountpage.navigateToOrderPage();
		System.out.println("successfully navigate To Order Page");
	  }

@Then("^I Want to see all available options below$")
public void i_Want_to_see_all_available_options_below(DataTable datatable) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
 //   throw new PendingException();
	
	List<String>ExpectedoptionsNames=datatable.asList(String.class);
	
	for(int i=0;i<ExpectedoptionsNames.size();i++) {
		System.out.println("Exp [" + i + "] :" +ExpectedoptionsNames.get(i));
	//	System.out.println(ExpectedoptionsNames.get(i));
	}
		List<String> ActualoptionsNames=testHelper.getMyaccountpage().getAllDataIntable();
		for(int i=0;i<ActualoptionsNames.size();i++) {
			System.out.println("Exp [" + i + "] :" + ActualoptionsNames.get(i));
		//System.out.println("found profileName:"+ActualoptionsNames.get(i));
		
		   Assert.assertEquals("Data Table not Available:", 
				   ExpectedoptionsNames.get(i), ActualoptionsNames.get(i));
	}
}	

	
}






  
  
  
  
  
  
  
  
  