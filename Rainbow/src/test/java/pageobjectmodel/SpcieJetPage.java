package pageobjectmodel;

import org.openqa.selenium.By;
import reusable.BaseCode;

public class SpcieJetPage extends BaseCode {
    public static void selectCityfromDropdown(String cityCode) {
        driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTNR']//a[@value='"+cityCode+"']")).click();
    }
}
