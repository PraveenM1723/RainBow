package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

//https://testautomationpractice.blogspot.com/
//https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

public class Project1 {
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
    @Test
    public void login() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123", Keys.ENTER);
    }

    @Test
    public void window() throws InterruptedException {
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'New Browser Window')]")).click();
        ArrayList<String> wins = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(wins.get(1));
        Thread.sleep(2000);
        driver.switchTo().window(wins.get(0));
    }
}
