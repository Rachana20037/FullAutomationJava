package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readnumeric {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./test data/friends.xlsx");
Workbook wb = WorkbookFactory.create(fis);
double data = wb.getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
System.out.println(data);
}
}
