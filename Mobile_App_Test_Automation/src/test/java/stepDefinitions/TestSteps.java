package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;

public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;

    public TestSteps(ContextSetup setup){
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }
//Check Home button start
    @Given("Check home button is available")
    public void checkHomeButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_Home().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Click on the home button")
    public void clickOnTheHomeButton() {
        WebElement homeButton = testingApp.Click_Home();
        homeButton.click();
    }

    @Then("Check that home is display")
    public void checkThatHomeIsDisplayed() {
        Assert.assertTrue(testingApp.Click_Home_page().isDisplayed());
    }


//Check Home button end

//Check Categories Start
    @Given("Check categories button is available")
    public void checkCategoriesButtonIsAvailable() {
        Assert.assertTrue(testingApp.Get_categories().isDisplayed());
}

    @When("Click on the Categories button")
    public void clickOnTheCategoriesButton() {
        WebElement homeButton = testingApp.Click_categories();
        homeButton.click();
    }

    @Then("Check the Categories is Display")
    public void checkTheCategoriesIsDisplay() {
        Assert.assertTrue(testingApp.Click_categories_page().isDisplayed());
    }


//Check Categories End

//Check Support Start
    @Given("Check Support button is available")
    public void checkSupportButtonIsAvailable() {
        Assert.assertTrue(testingApp.Get_support().isDisplayed());
    }

    @When("Click on the Support button")
    public void clickOnTheSupportButton() {
        WebElement homeButton = testingApp.Click_support();
        homeButton.click();
    }

    @Then("Check the Support us Display")
    public void checkTheSupportUsDisplay() {
        Assert.assertTrue(testingApp.Click_support_page().isDisplayed());
    }
//Check Support End

//Check Slider Start
    @Given("Check Slider button is available")
    public void checkProfileButtonIsAvailable() {
        Assert.assertTrue(testingApp.Get_profile().isDisplayed());
    }

    @When("Click on the Slider Button")
    public void clickOnTheProfileButton() {
        WebElement homeButton = testingApp.Click_profile();
        homeButton.click();
    }

    @Then("Check the Slider is Display")
    public void checkTheProfileIsDisplay() {
        Assert.assertTrue(testingApp.Click_profile_page().isDisplayed());
    }

//Check cart Start

    @Given("Check Cart button is available")
    public void checkCartButtonIsAvailable() {
        Assert.assertTrue(testingApp.Get_cart().isDisplayed());
    }

    @When("Click the Cart button")
    public void clickTheCartButton() {
        WebElement homeButton = testingApp.Click_cart();
        homeButton.click();
    }

    @Then("Check the cart button")
    public void checkTheCartButton() {
        Assert.assertTrue(testingApp.Click_cart_page().isDisplayed());
    }
//Check Cart End

}
