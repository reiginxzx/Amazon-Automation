package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage extends BasePage{

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By btnSearchLocator = By.id("nav-search-submit-button");

    By pageLinkTextLocator = By.linkText("3");


    public AmazonSearchPage(WebDriver driver) {
        super(driver);
    }


    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
    }
    public void enterSearchCriteria(String product){
        write(product,searchBoxLocator);
    }

    public void clickSearch(){
        click(btnSearchLocator);
    }

    public void goToThirdPage(int page){
        click(By.linkText(Integer.toString(page)));
    }



}
