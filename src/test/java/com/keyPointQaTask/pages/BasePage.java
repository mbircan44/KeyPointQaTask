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

    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement subMenuButton;

    @FindBy(xpath = "//div[@class='card-up']")
    public WebElement Elements;

    public void navigateToModule(String tab, String modul) throws InterruptedException {

        BrowserUtils.scrollDown();
        Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])''"+tab+"')"));

        WebElement module = Driver.get().findElement(By.xpath("//span[text()='"+modul+"']"));
      try {
          module.click();

      }catch(Exception e){
          BrowserUtils.clickWithJS(module);

      }
    }

}
