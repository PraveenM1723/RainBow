package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import static reusable.BaseCode.prop;

public class ReadingExcel {
    public static String getExcelData(String sheetname, int rowIndex, int columnIndex) throws IOException {

//        FileInputStream fis1= new FileInputStream(new File("src/main/resources/configuration/config.properties"));
//        Properties prop1 = new Properties();
//        prop1.load(fis1);
        //"src/main/resources/testData/loginData.xlsx")

//        FileInputStream capturingFiletoStream1= new FileInputStream(pathReturn());
//        Properties prop1 = new Properties();
//        prop1.load(capturingFiletoStream1);

        FileInputStream capturingFiletoStream2= new FileInputStream(new File(prop.getProperty("path")));
        XSSFWorkbook workbook = new XSSFWorkbook(capturingFiletoStream2);
        XSSFSheet sheet = workbook.getSheet(sheetname);
        String rowdata= sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        //String coldata= sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

        return rowdata;
    }
}
