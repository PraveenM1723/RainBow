package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import reusable.BaseCode;


public class SignPage extends BaseCode {

    public static void emailId(){
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(prop.getProperty("EmailidAmz"));
    }

    public static void clickContinue(){
        driver.findElement(By.cssSelector("#continue")).click();
    }

    public static void enterPassword(){
        driver.findElement(By.cssSelector("#ap_password")).sendKeys("signinpassword"+Keys.ENTER);
    }

    public static String errorMessage(){
        return  driver.findElement(By.xpath("//span[@class='a-list-item']")).getText();
    }

}
