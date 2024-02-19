package runners;
 
import org.testng.annotations.Test;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features="src//test//resources//features//",
		glue = {"stepDefinitions"},
		dryRun = false,//by default dryRun is "false"
		monochrome = true,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html"})
public class MyTestRunner extends AbstractTestNGCucumberTests{
  
}