package stepdefination;

import io.cucumber.java.en.Given;
import pageobjectmodel.AmazonHomePage1;

import static reusable.BaseCode.prop;

public class SampleConstrctorDemo {

    AmazonHomePage1 h;
    public SampleConstrctorDemo(){
        h= new AmazonHomePage1();
    }
    @Given("Sample")
    public void con(){
       // SampleConstrctorDemo d = new SampleConstrctorDemo();
        // this is method chaning using class return type to classname
//        h.enterProductName(prop.getProperty("searchProduct")).clickSearchIcon().clickSignin();
        h.enterProductName(prop.getProperty("searchProduct"));

    }
}
