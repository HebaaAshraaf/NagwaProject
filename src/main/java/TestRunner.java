import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/test/resources/features/search.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" ,
                "html:target/cucumber-reports" },
        monochrome = true ,
        publish = true
        )
public class TestRunner {

}