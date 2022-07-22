package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Page {
    public WebDriver driver;
    protected WebDriverWait wait;

    public Page(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }

    protected void openURL(String url) {
        driver.navigate().to(url);
    }

    protected void clickElement(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    protected void sendText(By element, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).clear();
        wait.until(ExpectedConditions.visibilityOfElementLocated(element)).sendKeys(text);
    }


    public void scrollDownByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,450)", "");
    }

    public void scrollUpByPixel() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "");
    }

    public String getElementText(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element)).getText();
    }

    public WebElement getElement(By element) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }
}


