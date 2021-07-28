package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FormAuthenticationPage;
import pages.SecureAreaPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static org.junit.Assert.*;

public class FormAuthenticationStepDef {

    FormAuthenticationPage formAuthenticationPage = new FormAuthenticationPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Given("I get the landing page")
    public void i_get_the_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I click on {string}")
    public void i_click_on(String menu) {
        formAuthenticationPage.getExample(menu);
    }

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        formAuthenticationPage.enterUsername(username);
        formAuthenticationPage.enterPassword(password);
    }

    @When("I click on login button")
    public void i_click_on_login_button() {
        formAuthenticationPage.clickLoginBtn();
    }

    @Then("I verify {string}")
    public void i_verify(String expectedErrorMessage) {
        String actualErrorMessage = formAuthenticationPage.getErrorMessage();
        assertTrue("wrong error message",actualErrorMessage.contains(expectedErrorMessage));
    }

    @Then("I verify successful login message {string}")
    public void i_verify_successful_login_message(String expectedSuccessMessage) {
        String actualSuccessMessage = secureAreaPage.getSuccessMessage();
        assertTrue("wrong error message",actualSuccessMessage.contains(expectedSuccessMessage));
    }

    @Then("I click on logout button")
    public void i_click_on_logout_button() {
        secureAreaPage.clickLogoutBtn();
    }

    @Then("I verify successful logout message {string}")
    public void i_verify_successful_logout_message(String expectedSuccessMessage) {
        String actualSuccessMessage = secureAreaPage.getSuccessMessage();
        assertTrue("wrong error message",actualSuccessMessage.contains(expectedSuccessMessage));
    }

}
