package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInputPage extends Page {

    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    public By textFieldButton = By.xpath("//input[@id='newButtonName']");
    public By changeTextButton = By.xpath("//button[@id='updatingButton']");

    public TextInputPage sendTextToInputField(String value) {
        sendText(textFieldButton, value);
        return this;
    }

    public TextInputPage clickOnTextFieldButton() {
        clickElement(textFieldButton);
        return this;
    }

    public TextInputPage clickOnChangeTextButton() {
        clickElement(changeTextButton);
        return this;
    }

}
