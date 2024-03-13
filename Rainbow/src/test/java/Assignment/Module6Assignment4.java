package Assignment;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Module6Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/09/selectable.html");
        Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.id("slider"));
        action.dragAndDropBy(ele,50,0).perform();
        driver.close();
    }
}
