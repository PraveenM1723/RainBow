package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Module4Assignment1_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.facebook.com/");
        WebElement element = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select day = new Select(element);
        day.selectByVisibleText("12");
        WebElement elementMonth = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select month = new Select(elementMonth);
        month.selectByVisibleText("Apr");
        WebElement elementyear = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select year = new Select(elementyear);
        year.selectByVisibleText("1998");
        driver.close();
    }
}
