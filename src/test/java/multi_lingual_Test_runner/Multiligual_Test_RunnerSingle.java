package multi_lingual_Test_runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = {"src/test/resources/Multilingual_cart_Order.feature"}
//		 ,tags= {"@wip"}
		 ,plugin= {"pretty"}
		,glue={"step_definitions_Miltilingual","multilingual_cart_Hook"}
		 
		 )


public class Multiligual_Test_RunnerSingle {

}
