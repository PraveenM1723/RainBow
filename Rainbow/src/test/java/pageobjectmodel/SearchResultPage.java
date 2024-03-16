package pageobjectmodel;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SearchResultPage extends BaseCode {

    public String getResultPageTitle(){
        return driver.getTitle();
    }

    public static void selectResult(int index){
        driver.findElement(By.xpath("//div[@data-cel-widget='search_result_"+index+"']//a")).click();
    }
}
