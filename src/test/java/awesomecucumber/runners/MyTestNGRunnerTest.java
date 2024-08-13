


package awesomecucumber.runners;

//import com.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.Reporter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.AfterClass;
import org.testng.annotations.DataProvider;

import java.io.File;


@CucumberOptions(
        plugin = {
        "html:target/cucumber-reports/cucumberreport.html",
                "rerun:target/failedrerun.txt",
        "com.epam.reportportal.cucumber.StepReporter"
},
        glue = { "awesomecucumber" },
        monochrome =true,
        publish = true,
        features = { "src/test/resources/awesomecucumber" }

)
public class MyTestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @AfterClass
    public static void writeExtentReport() {

        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.properties"));
    }

}



