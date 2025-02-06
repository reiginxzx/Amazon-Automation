package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"steps"},
    stepNotifications = true,
    snippets = CAMELCASE,
    plugin ={"pretty","html:target/cucumber-reports/report.html"}
    
)


public class Runner {

    
}
