package pl.testframework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
/*@CucumberOptions(features = "classpath:selenium.feature",
                glue = "classpath:pl.testframework",

)*/


@CucumberOptions(features = {"src\\test\\java\\resources\\selenium.feature"},
                plugin = {"pretty","html:target/selenium-reports"},
                glue = "pl.testframework"
)

public class MyTests {

}
