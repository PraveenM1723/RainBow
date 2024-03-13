package automationbasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ExamplteTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learnmoreplayground.blogspot.com/p/loginpage.html");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("LearnMore");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learnmore@123");
        driver.findElement(By.xpath("//button[@onclick='login()']")).click();

    }
}
