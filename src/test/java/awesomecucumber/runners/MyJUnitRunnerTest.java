
package awesomecucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber/cucumber.html",
                "rerun:target/failedrerun.txt",
                "pretty", "com.epam.reportportal.cucumber.StepReporter"
                //"pretty", "com.epam.reportportal.cucumber.ScenarioReporter",
        },
        glue = {"awesomecucumber"},
        features = "src/test/resources/awesomecucumber"
)
public class MyJUnitRunnerTest {
}

