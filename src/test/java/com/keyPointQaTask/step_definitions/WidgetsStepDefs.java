package com.keyPointQaTask.step_definitions;

import com.keyPointQaTask.pages.WidgetsPage;
import com.keyPointQaTask.utilities.BrowserUtils;
import com.keyPointQaTask.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WidgetsStepDefs {

         WidgetsPage widgetsPage = new WidgetsPage();
         Actions actions = new Actions(Driver.get());

    @When("the user navigate to {string} and {string}")
    public void  theUserNavigateToAnd(String tab, String module) throws InterruptedException {

        BrowserUtils.waitFor(4);
        widgetsPage.navigateToModule(tab,module);

    }
    @And("the user hover over the hover me to see button and verify message {string}")
    public void theUserHoverOverTheHoverMeToSeeButtonAndVerifyMessage(String message) {
        BrowserUtils.waitFor(3);
        actions.moveToElement(widgetsPage.hoverButton).build().perform();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(message,widgetsPage.blackMassage1.getText());

    }
    @And("the user hover over the Hover me to see text field and verify message {string}")
    public void theUserHoverOverTheHoverMeToSeeTextFieldAndVerifyMessage(String message2) {

        BrowserUtils.waitFor(3);
        actions.moveToElement(widgetsPage.hover2Button).build().perform();
        Assert.assertEquals(message2,widgetsPage.blackMessage2.getText());
    }
}
