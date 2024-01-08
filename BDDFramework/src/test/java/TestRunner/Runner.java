package TestRunner;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber; 
import io.cucumber.testng.AbstractTestNGCucumberTests; 
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(tags="", 
features = {"src/test/resources/BackgroundFeature"},
glue={"BackgroundStepDefinition"}, plugin = {"pretty", "html:target/htmlreport.html"}
) 


public class Runner extends AbstractTestNGCucumberTests 
{



}