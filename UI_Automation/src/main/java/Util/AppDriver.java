package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class AppDriver {
    WebDriver driver;

    public WebDriver SeleniumDriverSetup(String browser) throws Exception {
//         Check if parameter passed from testng.xml is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            return driver;
        }

//        Check if parameter passed from testng.xml is 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            return driver;
        } else {
            // If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
    }

}
