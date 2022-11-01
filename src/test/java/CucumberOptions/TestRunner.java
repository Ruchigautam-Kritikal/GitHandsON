package CucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ="src/test/java/features/login.feature",
        stepNotifications = true,glue=("stepDefinitions")
)
public class TestRunner {
}
