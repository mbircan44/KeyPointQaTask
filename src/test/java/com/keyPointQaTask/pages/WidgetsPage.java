package com.keyPointQaTask.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WidgetsPage extends BasePage{


    @FindBy(id = "toolTipButton")
    public WebElement hoverButton;

    @FindBy(id = "toolTipTextField")
    public WebElement hover2Button;

    @FindBy(css = "#buttonToolTip")
    public WebElement blackMassage1;

    @FindBy(css = ".fade.show.tooltip.bs-tooltip-bottom")
    public WebElement blackMessage2;
}
