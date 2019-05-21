import HW18thMay.HomePage;
import cucumber.api.java.en.Given;

public class MyStepdefs {

    HomePage homePage = new HomePage();
    @Given("user is on homepage")
    public void userIsOnHomepage() {
        homePage.verifyUserisOnHomePage();

    }
}
