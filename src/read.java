package Bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read {
    //reads the value in specific row x column
    public String readName(int vRow, int vColumn) {
        String value = null;
        Workbook book = null;

        try {
            FileInputStream excelFile = new FileInputStream("/Users/brent/Desktop/Java/Bank/BankSheet.xlsx");
            book = new XSSFWorkbook(excelFile);
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }

        Sheet docSheet = book.getSheetAt(0);
        Row row = docSheet.getRow(vRow);
        Cell cell = row.getCell(vColumn);
        value = cell.getStringCellValue();
        return value;
    }
}
