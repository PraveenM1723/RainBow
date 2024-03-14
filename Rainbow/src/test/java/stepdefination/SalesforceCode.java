package stepdefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import reusable.BaseCode;
import reusable.ReadingExcel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SalesforceCode extends BaseCode {

    @Given("user navigates to salesforce application")
            public void navigatToURL() {
        driver = new ChromeDriver();
        driver.get("https://login.salesforce.com/?locale=in");

    }

    @And("user clicks the login button")
    public void clickLogin(){
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }
    @Then("user validates the error message")
    public void errorValidation(){
        String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
        String expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        if(text.equals(expected))
            System.out.println("equal");
        else
            System.out.println("not equal");

    }
    @Then("verify whether the user navigates to Home page")
    public void verifyHomePage(){

    }

    @When("user enters the username and password {string}")
    public void enterUserandPass(String password) throws InterruptedException, IOException {
        driver.findElement(By.cssSelector("input#username")).sendKeys(ReadingExcel.getExcelData("login",0,0));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    }

    @Given("user navigates to amazon application")
    public void navigateToAmazon() {
    }

    @When("user enter the search keyword {string}")
    public void enterTheSearch(String arg0) {
    }

    @And("user clicks the search icon")
    public void clicksTheSearch() {
    }

    @Then("user validates the result")
    public void validatesResult() {
    }

    @And("user validate the title of the page")
    public void validateTitle() {
    }

    @Given("user extracts the column one value")
    public void columnOneValue() {
        WebElement infosysTable = driver.findElement(By.xpath("//table[@class='infobox vcard']"));
        int tableCoulmncount = infosysTable.findElements(By.tagName("th")).size();
        List<String> columnoneValuList= new ArrayList<String>();
        for (int n=0;n<tableCoulmncount;n++){
            String columnName=infosysTable.findElements(By.tagName("th")).get(n).getText();
            columnoneValuList.add(columnName);
        }
        System.out.println(columnoneValuList);

        int tableCoulmntwocount = infosysTable.findElements(By.tagName("td")).size();
        List<String> columntwoList = new ArrayList<String>();
        for (int n=2;n<tableCoulmncount;n++){
            String columntwoName=infosysTable.findElements(By.tagName("td")).get(n).getText();
            columntwoList.add(columntwoName);
        }
        System.out.println(columntwoList);

        WebElement Acquisitions = driver.findElement(By.xpath("//table[@class='wikitable']"));
        int columntwo=Acquisitions.findElements(By.xpath("//tr//td[5]")).size();
        List<String> acqList = new ArrayList<String>();
        for (int h=0;h<columntwo;h++){
            String column2dis=Acquisitions.findElements(By.xpath("//tr//td[5]")).get(h).getText();
            acqList.add(column2dis);
        }
        System.out.println(acqList);

    }
}
