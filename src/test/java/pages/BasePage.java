package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url){
        driver.get(url);
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isDisplayed(By locator) throws Exception {
        try{
            return driver.findElement(locator).isDisplayed();
        }catch (Exception e){
            throw new Exception("No se encontro el elemento");
        }

    }


    public void visit(String url){
        driver.get(url);
    }




}
