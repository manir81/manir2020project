package multi_lingual_Test_runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"}
//,tags= {"@wip"}
,plugin= {"pretty",
		"html:target/cucumber-reports/",
		"json:target/cucumber-reports/cucumber.json"}

,glue={"step_definitions_Miltilingual","multilingual_cart_Hook"}
 ,snippets = SnippetType.CAMELCASE
)


public class Multiligual_Test_RunnerAll {

}
