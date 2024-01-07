package com.loop.step_definitions;
import com.loop.pages.LoginPage;
import com.loop.utilities.BrowserUtil;
import com.loop.utilities.ConfigurationReader;
import com.loop.utilities.DocuportConstants;
import com.loop.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.loop.utilities.BrowserUtil.waitForClickable;
import static com.loop.utilities.DocuportConstants.USERNAME_CLIENT;
import static com.loop.utilities.DocuportConstants.large;
import static org.junit.Assert.assertTrue;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    //LoginPage loginPage = new LoginPage();
    @Given("user is on Docuport login page")
    public void user_is_on_docuport_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user enters username for client")
    public void user_enters_username_for_client() {
        BrowserUtil.waitForClickable(loginPage.usernameInput, DocuportConstants.large).sendKeys(DocuportConstants.USERNAME_CLIENT);
    }
    @When("user enters password for client")
    public void user_enters_password_for_client() {

    }
    @When("user clicks login buttom")
    public void user_clicks_login_buttom() {

    }
    @Then("user should see the home page for client")
    public void user_should_see_the_home_page_for_client() {

    }

    @When("user enters username for employee")
    public void user_enters_username_for_employee() {

    }
    @When("user enters password for employee")
    public void user_enters_password_for_employee() {

    }
    @Then("user should see the home page for employee")
    public void user_should_see_the_home_page_for_employee() {
;
    }

    @When("user enters username for advisor")
    public void user_enters_username_for_advisor() {

    }
    @When("user enters password for advisor")
    public void user_enters_password_for_advisor() {

    }
    @Then("user should see the home page for advisor")
    public void user_should_see_the_home_page_for_advisor() {

    }

    @When("user enters username for supervisor")
    public void user_enters_username_for_supervisor() {

    }
    @When("user enters password for supervisor")
    public void user_enters_password_for_supervisor() {

    }
    @Then("user should see the home page for supervisor")
    public void user_should_see_the_home_page_for_supervisor() {

    }


}