import Util.AppDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public abstract class BaseTestClass {
    public WebDriver driver;
    public SoftAssert softAssert;

    @BeforeClass
    @Parameters("browser")
    void beforeClass(@Optional("Chrome") String browser) throws Exception {
        AppDriver testInit = new AppDriver();
        driver = testInit.SeleniumDriverSetup(browser);
    }

    @BeforeMethod
    void beforeMethod() {
        softAssert = new SoftAssert();
    }

    @AfterClass
    void afterClass() {
        driver.quit();
    }

}
