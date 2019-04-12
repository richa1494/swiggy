package stepDefinations;

import cucumber.TestContext;
import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import managers.Log;

public class Swiggy {
    TestContext testContext;
    PageObjectRep.Swiggy swiggyPage;

    public Swiggy(TestContext context) {
        testContext = context;
        swiggyPage = testContext.getPageObjectManager().getSwiggyPage();
    }
    
    @Given("^Navigate to ​Swiggy$")
    public void navigateTo​Swiggy() throws Throwable {
        Log.startTestCase("navigate to Application and login with credentials");
        swiggyPage.navigateTo_AppLogin();
    }

    @Then("^Enter delivery location as ​Indiranagar​, ​Bengaluru$")
    public void enterDeliveryLocationAs​Indiranagar​​Bengaluru() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.select_location();

    }

    @Then("^Select first result which is ​Indiranagar, Bengaluru, Karnataka, India$")
    public void selectFirstResultWhichIs​IndiranagarBengaluruKarnatakaIndia() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("^Click on ​Search$")
    public void clickOn​Search() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.search();
    }

    @Then("^Search for Restaurant called ​“Bite Me” ​and Click on it$")
    public void searchForRestaurantCalled​BiteMe​andClickOnIt() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.res();
    }

    @When("^Restaurant loaded, Add few items to the cart$")
    public void restaurantLoadedAddFewItemsToTheCart() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.bakary();
    }

    @Then("^Click on Checkout$")
    public void clickOnCheckout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        swiggyPage.address();
    }

    @And("^Verify Items added in checkout page ")
    public void verifyItemsAddedInCheckoutPage​httpsWwwSwiggyComCheckout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       swiggyPage.add();
    }


    @And("^Enter Details for cehckout$")
    public void enterDetailsForCehckout() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @But("^Error message at Email field ​“Email id already exists”​ and  Capture screenshot$")
    public void errorMessageAtEmailField​EmailIdAlreadyExists​AndCaptureScreenshot() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Change Red Velvet cupcake quantity to (\\d+)$")
    public void changeRedVelvetCupcakeQuantityTo(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Capture screenshot and close  browser$")
    public void captureScreenshotAndCloseBrowser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^Verify Items added in checkout page$")
    public void verifyItemsAddedInCheckoutPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Click on ​“New to Swiggy SIGN UP$")
    public void clickOn​NewToSwiggySIGNUP() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}