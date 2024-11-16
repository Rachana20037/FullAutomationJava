package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateExcelData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./test data/friends.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("Sheet1").getRow(3).getCell(1).setCellValue("harshu");
FileOutputStream fos=new FileOutputStream("./test data/friends.xlsx");
wb.write(fos);
wb.close();
}
}
