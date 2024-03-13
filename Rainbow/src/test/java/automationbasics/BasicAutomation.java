package automationbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasicAutomation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input#username")).sendKeys("HI");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Password");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //String Text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='loginError']"))).getText();
        String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
        System.out.println(text);


    }




}
