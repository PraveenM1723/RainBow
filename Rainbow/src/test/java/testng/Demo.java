package testng;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.reactor.Command;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Demo {

    WebDriver driver;
    @BeforeTest
    public void launch(){
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @AfterTest
    public void teardown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }
    @Test(priority = 3)
    public void google() throws IOException {
        //driver = new ChromeDriver();
        driver.get("https://www.google.com");
        TakesScreenshot scrImg = ((TakesScreenshot)driver);
        File scrFile = scrImg.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".src/pictures/google.png");
        FileUtils.copyFile(scrFile,destFile);


    }

    @Test(priority = 2)
    public void facebook() throws IOException {
        // driver=  new EdgeDriver();
        driver.get("https://www.facebook.com/");
        TakesScreenshot scrImg = ((TakesScreenshot)driver);
        File scrFile = scrImg.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".src/pictures/fb.png");
        FileUtils.copyFile(scrFile,destFile);

    }

    @Test(priority = 1)
    public void amazon() throws IOException {
        // driver=  new EdgeDriver();
        driver.get("https://www.amazon.com/");
        TakesScreenshot scrImg = ((TakesScreenshot)driver);
        File scrFile = scrImg.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".src/pictures/amazon.png");
        FileUtils.copyFile(scrFile,destFile);

    }
}
