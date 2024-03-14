package reusable;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadingExcel {
    public static String getExcelData(String sheetname, int rowIndex, int columnIndex) throws IOException {
        FileInputStream fis= new FileInputStream(new File("src/main/resources/testData/loginData.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetname);
        String rowdata= sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();
        //String coldata= sheet.getRow(rowIndex).getCell(columnIndex).getStringCellValue();

        return rowdata;
    }
}
