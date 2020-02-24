package com.mavenit.prac.step_definitions;

import com.mavenit.prac.pages.Homepage;
import com.mavenit.prac.pages.Loginpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.junit.Assert.assertThat;


public class LoginSteps {
    private Homepage homepage= new Homepage();
    private Loginpage loginpage= new Loginpage();

    @Given("^the user is on Accountspage$")
    public void the_user_is_on_Accountspage() {
       String actual= homepage.getCurrentUrl();
       assertThat(actual, endsWith(".com/uk/"));
       homepage.clickLogin();

    }

    @When("^I enter User ID as “aashna_patel@hotmail\\\\.com””$")
    public void i_enter_User_ID_as_aashna_patel_hotmail_com() throws Throwable {
        loginpage.enterUsername();

    }

    @When("^I enter Password as “(\\d+)”$")
    public void i_enter_Password_as(int arg1) throws Throwable {
        loginpage.enterPassword();
    }

    @When("^click Submit$")
    public void click_Submit() throws Throwable {
        loginpage.clickSubmit();
    }

    @Then("^user should not be logged in successfully$")
    public void user_should_not_be_logged_in_successfully() throws Throwable {
        loginpage.errorMessage();
    }

}
