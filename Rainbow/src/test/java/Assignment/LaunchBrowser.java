package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LaunchBrowser {
        public static void main(String[] args) {

                WebDriverManager.edgedriver().setup();
                WebDriver driver= new EdgeDriver();
                driver.get("https://www.google.co.in/");
                driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
                System.out.println(driver.getTitle());
                driver.quit();

        }

}
