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

        switch (tab){

            case "Alerts, Frame & Windows":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[3]")).click();
                break;
            case "Widgets":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[4]")).click();
                break;
            case "Interactions":
                Driver.get().findElement(By.xpath("(//div[@class='card mt-4 top-card'])[5]")).click();
                break;

        }

        WebElement module = Driver.get().findElement(By.xpath("//span[text()='"+modul+"']"));
      try {
          module.click();

      }catch(Exception e){
          BrowserUtils.clickWithJS(module);

      }
    }

}
