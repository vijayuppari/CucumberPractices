package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/LoginwithExample.feature"},
        glue = {"Stepdefinations"},
        plugin = {"pretty"}
)
public class ScenarioOutlineTest {

}
