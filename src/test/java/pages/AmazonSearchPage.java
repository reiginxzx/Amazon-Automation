package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AmazonSearchPage extends BasePage{

    By searchBoxLocator = By.id("twotabsearchtextbox");
    By btnSearchLocator = By.id("nav-search-submit-button");

    By itemListLocator = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/h2[1]/a[1]/span[1]");

    By btnAddToCardLocator = By.id("add-to-cart-button");
    By addedToCartLocator =  By.xpath("//span[contains(text(),'Agregado al carrito')]");
    //By pageLinkTextLocator = By.linkText("3");


    public AmazonSearchPage(WebDriver driver) {
        super(driver);
    }


    public void navigateToAmazon(){
        navigateTo("https://www.amazon.com");
    }
    public void enterSearchCriteria(String product){
        isDisplayed(searchBoxLocator);
        write(product,searchBoxLocator);
    }

    public void clickSearch(){
        click(btnSearchLocator);
    }

    public void goToThirdPage(int page){
        click(By.linkText(Integer.toString(page)));
    }

    public void pickSecondItem() {
        isDisplayed(itemListLocator);
        click(itemListLocator);
    }

    public void addToCart(){
        click(btnAddToCardLocator);
    }

    public String addedMsgText(){
        return getText(addedToCartLocator);
    }

}
