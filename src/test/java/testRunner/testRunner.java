package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Ordnance.feature",
        glue = "stepDefinations", dryRun = false, monochrome = false, plugin = {"pretty", "html:test-output"}
)
public class testRunner {
}
