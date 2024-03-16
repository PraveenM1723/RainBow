package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class AmazonHomePage extends BaseCode {
    public void enterProductName(String productName){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
    }
    public void clickSearchIcon(){
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    }

    public static void clickSignin(){
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
        driver.findElement(By.linkText("Sign in")).click();


    }
}
