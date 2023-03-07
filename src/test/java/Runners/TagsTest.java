package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/AppFeatures/Loginwithbackgroud.feature"},
        glue = {"Stepdefinations"},
        tags ="@All", // execute in feature level
        //tags= "not @Fresh", // Its excludes the Fresh Tag
        //tags = "@Fresh and @Prime", // Execute the tags which is having both Fresh and Prime
       // tags = "@Fresh or @Prime", // execute Fresh and Prime scenarios
        plugin = {"pretty"}
)


public class TagsTest {


}

// When we want to execute form command line
//*** mvn clean install or mvn test
// If we want to include tags using in maven
 //**** mvn test -Dcucumber.filter.tags="@Fresh" // same like tags we are using in Runner file
