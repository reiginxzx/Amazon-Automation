package steps;

import org.openqa.selenium.WebDriver;
import pages.AmazonSearchPage;

public class StepsBase {

    protected WebDriver driver=Hooks.getDriver();

    protected AmazonSearchPage amazonSearchPage = new AmazonSearchPage(driver);
    
}
