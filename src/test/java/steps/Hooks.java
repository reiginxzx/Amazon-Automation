package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Hooks {

    private static WebDriver webDriver;
    private int numberOfScenario=0;


    @Before
    public void setUp() {
        System.out.print("se leyo hooks");
        System.setProperty("webdriver.chrome.driver","src/test/resources/web_drivers/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://www.amazon.com");

        
    }

    @After
    public void tearDown() {
        //webDriver.quit();
    }

    public static WebDriver getDriver(){
        return webDriver;
    }
    
    
}
