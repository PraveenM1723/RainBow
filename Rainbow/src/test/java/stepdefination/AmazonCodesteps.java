package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import reusable.BaseCode;

import javax.swing.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AmazonCodesteps extends BaseCode {
    @Given("user selects the category in the homepage")
    public void selectCategory(){
        WebElement selectCatgeoryelement = driver.findElement(By.id("searchDropdownBox"));
        Select category = new Select(selectCatgeoryelement);
        //category.selectByIndex(3);
        //category.selectByVisibleText("Amazon Fresh");
        category.selectByValue("search-alias=amazon-pharmacy");

//        WebElement currencyElement = driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
//        Select currency = new Select(currencyElement);
//        currency.selectByValue("fish");
//        for ( int i=0;i < selectCatgeoryelement.findElements(By.tagName("option")).size();i++){
//
//          String name =  selectCatgeoryelement.findElements(By.tagName("option")).get(i).getText();
//            System.out.println(name);
//
//
//        }

        List<WebElement> l = selectCatgeoryelement.findElements(By.tagName("option"));
        List<String> catagoryVal = new ArrayList<String>();
        for(WebElement ls:l){
            catagoryVal.add(ls.getText());
        }
        for (String cat:catagoryVal)
            System.out.println(cat);

        for (String cat:catagoryVal){
            if (cat.equals("Books")) {
                Assert.assertTrue(true);
                break;
            }
        }




    }

    @Given("user handles the dynamic dropdown")
    public void dynamicDropdownHandle() {
        driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
       // driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); or
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        WebElement toElement= driver.findElement(By.id("glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR"));
//
//        toElement.findElement(By.xpath("//a[@value='MAA']")).click(); or realtive xpath + relative xpath

        driver.findElement(By.xpath("//div[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR']//a[@value='MAA']")).click();


    }

    @Given("user navigates to baby whish list page")
    public void userNavigatesWhishListPage() {
        WebElement accountListElement = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions action = new Actions(driver);
        action.clickAndHold(accountListElement).build().perform();

        //Explict wait
//        WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(10));
//        waitTime.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Baby Wishlist']")));

        //Fluent wait
        WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(10));
        waitTime.pollingEvery(Duration.ofSeconds(2));
        waitTime.ignoring(NoSuchElementException.class);
        waitTime.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Baby Wishlist']")));

        //driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
        //driver.findElement(By.linkText("Baby Wishlist")).click();
        driver.findElement(By.linkText("Baby Wishlist")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

        Set<String> windowHanVal= driver.getWindowHandles();

        for (String l:windowHanVal) {
            driver.switchTo().window(l);
            System.out.println(driver.getTitle());
        }
        driver.switchTo().defaultContent();

    }

    @Given("user handles drap and drop")
    public void userHandlesDrapAndDrop() {
        WebElement frame = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(frame);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions dragAction = new Actions(driver);
        dragAction.dragAndDrop(drag,drop).build().perform();

        driver.switchTo().defaultContent();
    }
}
