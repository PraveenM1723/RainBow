package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module4Assignment4 {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        System.out.println(driver.findElements(By.tagName("a")).size());

    }
}
