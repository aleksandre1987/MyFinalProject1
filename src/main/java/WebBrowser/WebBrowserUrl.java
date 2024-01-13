package WebBrowser;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class WebBrowserUrl {
    protected WebDriver driver = new ChromeDriver();

    @BeforeMethod

    public void openBrowser(){
        driver.manage().window().maximize();
        driver.get("https://www.glassdoor.ca/index.htm");

    }
    @AfterSuite

    public void closeBrowser (){
      driver.quit();
    }
}
