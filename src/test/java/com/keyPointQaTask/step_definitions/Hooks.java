package com.keyPointQaTask.step_definitions;
import com.keyPointQaTask.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;

public class Hooks {
    @Before

    public void setUp() {
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);


    }

    @After
    public void tearDown(Scenario Scenario) {
        if(Scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            Scenario.attach(screenshot,"image/png","screenshot");
        }
        System.out.println("This is coming from AFTER/HOOKS");
        Driver.closeDriver();

    }
}
