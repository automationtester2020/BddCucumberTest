import base.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions
   (
        features = {"src/test/java/features/register.feature"},
        //plugin = {"pretty:target/test.html"}
           plugin = {"pretty","html:target/report.html"},
        //   tags = {"@regression", }
            monochrome = true,
           strict = true,
           dryRun = true

   )

@RunWith(Cucumber.class)

public class TestRunner
{

}

