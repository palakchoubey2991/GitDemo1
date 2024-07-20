package SeleniumPrac;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadJavaFileUsingIteraror {
    public static void main(String args[]) throws IOException {
        String path="C:\\Users\\Dell\\IdeaProjects\\TestingPrac\\TestData\\DataFile.xlsx";
        FileInputStream ip=new FileInputStream(path);
        XSSFWorkbook wp=new XSSFWorkbook(ip);
        XSSFSheet sheet=wp.getSheet("Sheet1");
        Iterator itr=sheet.iterator();
        while(itr.hasNext())
        {
            XSSFRow row=(XSSFRow)itr.next();
            Iterator cellIterartor=row.cellIterator();
            while (cellIterartor.hasNext())
            {
                XSSFCell cell=(XSSFCell)cellIterartor.next();
                switch (cell.getCellType())
                {
                    case STRING: System.out.print(cell.getStringCellValue());
                    break;
                    case NUMERIC:System.out.print(cell.getNumericCellValue());
                    break;
                    case BOOLEAN:System.out.print(cell.getBooleanCellValue());
                }
            }
        }


    }
}
