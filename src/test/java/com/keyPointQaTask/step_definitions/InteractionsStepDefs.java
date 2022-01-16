package com.keyPointQaTask.step_definitions;

import com.keyPointQaTask.pages.InteractionsPage;
import com.keyPointQaTask.utilities.Driver;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class InteractionsStepDefs {
    InteractionsPage interactionsPage = new InteractionsPage();

    @And("the user does drag and drop")
    public void theUserDoesDragAndDrop() {

        Actions actions = new Actions(Driver.get());
        actions.moveToElement(interactionsPage.sourceButton).clickAndHold()
                .moveToElement(interactionsPage.targetButton).pause(2000).release().perform();
    }

    @And("the user verify the {string}")
    public void theUserVerifyThe(String message) {

        System.out.println("droppedText = " + interactionsPage.droppedText.getText());
        Assert.assertEquals(message,interactionsPage.droppedText.getText());

    }
}
