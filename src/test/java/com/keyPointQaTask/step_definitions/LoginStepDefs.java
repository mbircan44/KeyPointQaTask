package com.keyPointQaTask.step_definitions;

import com.keyPointQaTask.pages.LoginPage;
import com.keyPointQaTask.utilities.BrowserUtils;
import com.keyPointQaTask.utilities.ConfigurationReader;
import com.keyPointQaTask.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.get().get(ConfigurationReader.get("url2"));

    }

    @When("the user log in using following credentials {string} and {string}")
    public void theUserLogInUsingFollowingCredentialsAnd(String username,String password) {

        loginPage.loginWithPerson(username,password);
        BrowserUtils.waitFor(3);
    }

    @Then("the following {string} should be displayed")
    public void theFollowingShouldBeDisplayed(String expectedMessage) {

        String actualText = loginPage.warningMessage.getText();
        System.out.println(actualText);
        Assert.assertEquals(expectedMessage,actualText);
        BrowserUtils.waitFor(2);

    }

    @Then("the user should see {string}")
    public void theUserShouldSee(String expextedText) {

        String actualText = loginPage.textProducts.getText();
        Assert.assertEquals(expextedText,actualText);
        BrowserUtils.waitFor(2);
    }

    @When("the user log in using {string} and {string}")
    public void theUserLogInUsingAnd(String username, String password) {

        loginPage.loginWithPerson(username,password);

    }
}
