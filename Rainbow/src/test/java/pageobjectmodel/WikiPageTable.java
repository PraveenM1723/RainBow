package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import reusable.BaseCode;

import java.util.ArrayList;
import java.util.List;

public class WikiPageTable extends BaseCode {
    public static List<String> getColumn(int columnIndex){
       List<WebElement> web= driver.findElements(By.xpath("//table[@class='wikitable']//tr//td["+columnIndex+"]"));
       List<String> columnValues = new ArrayList<String>();
       for(WebElement op:web)
       {
           columnValues.add(op.getText());
       }
       return columnValues;
    }

    public static String getSpecificValueinTable(String rowIndex, String columnIndex){
       return driver.findElement(By.xpath("//table[@class='wikitable']//tr["+rowIndex+"]//td["+columnIndex+"]")).getText();
    }
}
