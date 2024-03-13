package stepdefination;

import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import reusable.BaseCode;

import java.io.IOException;

import static reusable.BaseCode.driver;

public class Hooks extends  BaseCode{

    @Before
    public void setUp() throws IOException {
//        BaseCode baseCode = new BaseCode();
//        baseCode.launchBrowser();
        System.out.println("Execution started");
        BaseCode.launchBrowser();
    }
    @After
    public void tearDown(){
        System.out.println("execution ended");
        driver.quit();

    }

    @BeforeStep
    public void beforeStepMethod(){

        System.out.println("before step");
    }
    @AfterStep
    public void takeScreenShot(Scenario sc){
        System.out.println("Taking Screenshot");
        byte[] byteImage = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(byteImage,"image/png", sc.getName());

    }

}
