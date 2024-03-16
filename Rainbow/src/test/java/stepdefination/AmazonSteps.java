package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pageobjectmodel.AmazonHomePage;
import pageobjectmodel.SearchResultPage;
import pageobjectmodel.SignPage;

import java.io.IOException;

import static reusable.BaseCode.prop;

public class AmazonSteps {

    @Given("user searches product")
    public void userEnterName() throws IOException {
        AmazonHomePage ag= new AmazonHomePage();
        ag.enterProductName(prop.getProperty("searchProduct"));
        ag.clickSearchIcon();
    }


    @Then("user validates the title of search result page")
    public void validatesTitle() throws IOException {
        SearchResultPage pg = new SearchResultPage();
        Assert.assertEquals(prop.getProperty("ExpectedTitle"),pg.getResultPageTitle());
    }

    @Given("user provides credi")
    public void userProvidesCredi() {
        AmazonHomePage.clickSignin();
        SignPage.emailId();
        SignPage.clickContinue();
        SignPage.enterPassword();
    }

    @Then("validate the error")
    public void validateTheError() {
        System.out.println(SignPage.errorMessage());
        Assert.assertEquals(prop.getProperty("expcted_error"),SignPage.errorMessage());
    }

    @Then("user clicks on the result")
    public void userClicksOnTheResult() {
        SearchResultPage.selectResult(Integer.parseInt(prop.getProperty("indexTo_SearchResult")));
    }
}
