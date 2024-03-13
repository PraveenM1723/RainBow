package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module5Assignment5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Praveen");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
        driver.close();
    }
}
