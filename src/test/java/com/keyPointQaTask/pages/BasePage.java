package com.keyPointQaTask.pages;

import com.keyPointQaTask.utilities.BrowserUtils;
import com.keyPointQaTask.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void navigateToModule(String tab, String modul) throws InterruptedException {

        BrowserUtils.scrollDown();
        BrowserUtils.waitFor(2);

        WebElement tab1 = Driver.get().findElement(By.xpath("//h5[text()='" + tab + "']"));

        tab1.click();

        WebElement module = Driver.get().findElement(By.xpath("//span[text()='" + modul + "']"));
        try {

            module.click();

        } catch (Exception e) {
            BrowserUtils.clickWithJS(module);

        }
    }

}
