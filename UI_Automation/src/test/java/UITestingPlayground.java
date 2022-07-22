import Pages.HomePage;
import Pages.TextInputPage;
import Pages.VerifyTextPage;
import org.testng.annotations.Test;

public class UITestingPlayground extends BaseTestClass {


    @Test(priority = 1)
    public void clickTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage().
                clickOnClickButton();

        softAssert.assertEquals(driver.getCurrentUrl().contains("click"), true);
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void playGroundButtonColorTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.clickOnPlayGroundButton();
        softAssert.assertEquals(homePage.getPlaygroundButtonColour(), "rgba(33, 136, 56, 1)", "button is clickable");
        softAssert.assertAll();
    }


    @Test(priority = 3)
    public void changeTextTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage()
                .clickOnTextInputButton()
                .clickOnTextFieldButton()
                .sendTextToInputField("Hussein")
                .clickOnChangeTextButton();

        TextInputPage textInputPage = new TextInputPage(driver);
        softAssert.assertEquals(textInputPage.getElementText(textInputPage.changeTextButton), "Hussein", "button is Changed");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    public void verifyTextTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage()
                .clickOnVerifyTextButton();

        VerifyTextPage verifyTextPage = new VerifyTextPage(driver);
        softAssert.assertEquals(verifyTextPage.getWelcomeText(), "Welcome UserName!", "Text is right");
        softAssert.assertAll();

    }

}
