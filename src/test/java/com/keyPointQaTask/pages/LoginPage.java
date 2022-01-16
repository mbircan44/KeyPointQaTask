package com.keyPointQaTask.pages;

import com.keyPointQaTask.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "(//input[contains(@class,'input_error form_input')])[1]")
    public WebElement usernameInput;
    @FindBy(xpath = "(//input[contains(@class,'input_error form_input')])[2]")
    public WebElement passwordInput;
    @FindBy(css = "#login-button")
    public WebElement loginButton;
    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement warningMessage;
    @FindBy(xpath = "//span[text()='Products']")
    public WebElement textProducts;



    public void loginWithPerson(String username,String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();


    }
}
