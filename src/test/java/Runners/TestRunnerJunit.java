
package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Search.feature"},
        glue = {"Stepdefinations","Hooks"},
       plugin = {"pretty",
                    "json:target/MyReports/report.json",
                    "junit:target/MyReports/report.xml"}
      //  publish = true// If we want to publish results to cloud we can use this property in Runner file or create
                        // cucumber properties file
       // monochrome = true// Its used for proper alignment in console
       // dryRun = true // If any step defination is missing for any feature it wont execute any feature file.
)


public class TestRunnerJunit {

}
