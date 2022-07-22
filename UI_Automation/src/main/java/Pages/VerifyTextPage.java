package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyTextPage extends Page {

    public VerifyTextPage(WebDriver driver) {
        super(driver);
    }

    public By welcomeText = By.xpath("//div[@class='bg-primary']//span[@class='badge-secondary']");

    public String getWelcomeText() {
        return getElementText(welcomeText);
    }
}
