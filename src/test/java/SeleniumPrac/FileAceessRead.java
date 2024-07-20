package SeleniumPrac;

import org.apache.poi.hssf.record.PageBreakRecord;
import org.apache.poi.ss.formula.atp.Switch;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileAceessRead {
    public static void main(String args[]) throws IOException {
        String path="C:\\Users\\Dell\\IdeaProjects\\TestingPrac\\TestData\\DataFile.xlsx";
        FileInputStream ip=new FileInputStream(path);
        XSSFWorkbook xw=new XSSFWorkbook(ip);
        XSSFSheet sheet=xw.getSheet("Sheet1");
        int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(1).getLastCellNum();
        System.out.println(rows);
        System.out.println(cols);
        for (int r=0;r<=rows;r++)
        {
            XSSFRow rw=sheet.getRow(r);
            for(int c=0;c<cols;c++)
            {
                XSSFCell rc=rw.getCell(c);
                switch (rc.getCellType())
                {
                    case STRING: System.out.print(rc.getStringCellValue());
                        break;
                    case NUMERIC:System.out.print(rc.getNumericCellValue());
                    break;
                    case BOOLEAN:System.out.print(rc.getBooleanCellValue());
                    break;
                }
                System.out.print("  ! ");
            }
            System.out.println();
        }

    }
}
