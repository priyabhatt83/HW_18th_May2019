package HW18thMay;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class MyStepdefs {

    HomePage homePage = new HomePage();
    RegitrationPage regitrationPage = new RegitrationPage();
    VerificationPage verificationPage = new VerificationPage();
    ClothingPage clothingPage = new ClothingPage();
    ChangeCurrency changeCurrency = new ChangeCurrency();



    @Given("user is on homepage")
public void user_is_on_homepage() {
        homePage.verifyUserisOnHomePage();
    }

    @When("user enters all details")
    public void user_enters_all_details() {
        regitrationPage.userShouldAbleToRegisterSuccessfully();
    }

    @Then("user should able to register successfully")
    public void user_should_able_to_register_successfully() {
        verificationPage.registrationSuccesfullMessage();

    }

    @When("user click on product")
    public void userClickOnProduct()
    {
        clothingPage.userIsOnClothingPage();
    }

    @And("click change currency")
    public void clickChangeCurrency() {
        changeCurrency.userIsAbleToChangeCurrency();

    }

    @Then("user should able to change currency")
    public void userShouldAbleToChangeCurrency() {
        verificationPage.userCanSeeThatAreProductCurrencyAreChanged();
    }
}
