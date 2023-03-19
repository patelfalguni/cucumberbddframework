import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".//src/test/java/Features/HeroKuapp.feature",
        glue = "StepDefination",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-report.html"})



public class RunCucumberDemoTest {
}
