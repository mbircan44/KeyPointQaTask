package com.keyPointQaTask.pages;

import com.keyPointQaTask.utilities.BrowserUtils;
import com.keyPointQaTask.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage {

    @FindBy(xpath = "//button[@id='alertButton']")
    public WebElement clickMe1;

    @FindBy(id = "timerAlertButton")
    public WebElement clickMe2;

    @FindBy(xpath = "//button[@id='confirmButton']")
    public WebElement clickMe3;

    @FindBy(css = "#promtButton")
    public WebElement clickMe4;

    @FindBy(css = "#confirmResult")
    public WebElement text3;

    @FindBy(css = "#promptResult")
    public WebElement text4;






    }

