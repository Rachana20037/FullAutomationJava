package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class datafromexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./test data/friends.xlsx");
Workbook wb=WorkbookFactory.create(fis);
String data = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
System.out.println(data);
	}
}
