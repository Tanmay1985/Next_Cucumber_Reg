package TestRunner;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features ="src/test/java/Features",
        glue = "StepDefinition",
        dryRun = true,
        monochrome = true,
        plugin = {"pretty", "html: Reg_Test"}
)

public class TestRunner {


}
