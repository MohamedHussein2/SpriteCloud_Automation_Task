package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class AppDriver {
    protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public WebDriver SeleniumDriverSetup(String browser) throws Exception {
//         Check if parameter passed from web.xml is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
//            options.addArguments("--headless"); //You can un-comment it if you need to run in the headless mode
            driver.set(new FirefoxDriver(options));
            driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get().manage().window().maximize();
            return driver.get();
        }

//        Check if parameter passed from testng.xml is 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");
//            //options.addArguments("--headless"); //You can un-comment it if you need to run in the headless mode
            driver.set(new ChromeDriver(options));
            driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get().manage().window().maximize();
            return driver.get();
        }
        else {
            // If no browser passed throw exception
            throw new Exception("Browser is not correct");
        }
    }

}
