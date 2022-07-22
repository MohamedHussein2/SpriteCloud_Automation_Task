package Pages;

import Util.URLs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends Page {
    public By clickButton = By.xpath("//a[normalize-space()='Click']");
    public By playGroundButton = By.xpath("//button[@id='badButton']");
    public By textInputButton = By.xpath("//a[normalize-space()='Text Input']");
    public By verifyTextButton = By.xpath("//a[normalize-space()='Verify Text']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        openURL(URLs.TESTING_PLAY_GROUND.getValue());
        return this;
    }

    public void clickOnClickButton() {
        clickElement(clickButton);
    }

    public void clickOnPlayGroundButton() {
        clickElement(playGroundButton);
    }

    public TextInputPage clickOnTextInputButton() {
        clickElement(textInputButton);
        return new TextInputPage(driver);
    }

    public VerifyTextPage clickOnVerifyTextButton() {
        clickElement(verifyTextButton);
        return new VerifyTextPage(driver);
    }

    public WebElement getPlayGroundButton() {
        return getElement(playGroundButton);
    }

    public String getPlaygroundButtonColour() throws InterruptedException {
        Thread.sleep(2000);
        return getPlayGroundButton().getCssValue("background-color");

    }
}
