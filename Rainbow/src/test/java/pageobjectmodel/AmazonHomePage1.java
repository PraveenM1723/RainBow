package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import reusable.BaseCode;

public class AmazonHomePage1 extends BaseCode {
    public AmazonHomePage1 enterProductName(String productName){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(productName);
        return this;
    }
    public AmazonHomePage1 clickSearchIcon(){
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        return this;
    }

    public AmazonHomePage1 clickSignin(){
        Actions action = new Actions(driver);
        action.clickAndHold(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
        driver.findElement(By.linkText("Sign in")).click();
        return this;
    }
}
