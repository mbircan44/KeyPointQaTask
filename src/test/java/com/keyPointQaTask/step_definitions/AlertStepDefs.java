package com.keyPointQaTask.step_definitions;
import com.keyPointQaTask.pages.AlertPage;
import com.keyPointQaTask.utilities.BrowserUtils;
import com.keyPointQaTask.utilities.ConfigurationReader;
import com.keyPointQaTask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AlertStepDefs {

    AlertPage alertPage = new AlertPage();

    @Given("the user is on the home page")
    public void theUserIsOnThePage() {

        Driver.get().get(ConfigurationReader.get("url1"));
        BrowserUtils.waitFor(4);

    }

    @And("the user sees alert and click and handle")
    public void theUserSeesAlertAndClickAndHandle() {

        BrowserUtils.waitFor(2);
        alertPage.clickMe1.click();
        Driver.get().switchTo().alert().accept();

    }

    @And("the user click and waits and handle")
    public void theUserClickAndWaitsAndHandle() throws InterruptedException {

        alertPage.clickMe2.click();
        Thread.sleep(6000);
        Driver.get().switchTo().alert().accept();

    }

    @And("the user clicks and handles and verify {string}")
    public void theUserClicksAndHandlesAndVerify(String message1) throws InterruptedException {

        alertPage.clickMe3.click();
        Alert alert = Driver.get().switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Assert.assertEquals(message1,alertPage.text3.getText());

    }

    @Then("the users enters {string} and verifies {string}")
    public void theUsersEntersAndVerifies(String note, String message2) {

        alertPage.clickMe4.click();
        Alert alert = Driver.get().switchTo().alert();
        alert.sendKeys(note);
        alert.accept();
        Assert.assertEquals(message2,alertPage.text4.getText());
    }
}
