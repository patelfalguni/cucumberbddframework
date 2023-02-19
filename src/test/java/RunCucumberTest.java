import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src/test/java/Features/SkyAccount.feature",
        glue = "StepDefination",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty"})


public class



RunCucumberTest {

    }

