package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class HdfcNet {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://netbanking.hdfcbank.com/netbanking/");
        System.out.println(driver.getTitle());
        WebElement frame = driver.findElement(By.name("login_page"));
        driver.switchTo().frame(frame);
        driver.findElement(By.partialLinkText(("Know More..."))).click();
        ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(list.get(1));
        System.out.println(driver.getTitle());
        driver.switchTo().window(list.get(0));
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
