package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Module4Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("BigBoy");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("King");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("BigBoy@king.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Password");
        WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select day = new Select(element);
        day.selectByVisibleText("12");
        WebElement elementMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select month = new Select(elementMonth);
        month.selectByVisibleText("Apr");
        WebElement elementyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select year = new Select(elementyear);
        year.selectByVisibleText("1998");
        driver.findElement(By.xpath(("(//label[@class='_58mt'])[2]"))).click();
        driver.findElement(By.name("websubmit")).click();
        driver.close();
    }
}
