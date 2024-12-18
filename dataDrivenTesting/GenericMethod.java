package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethod {
	
	
	public  String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./test data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
      return data;
	}
public String readDataFromExcel(String sheet,int row,int cell) throws IOException {
	FileInputStream fis=new FileInputStream("./test data/friends.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	 return data;
}
public void UpdateDataIntoExcel(String sheet,int row,int cell,String updatevalue) throws IOException{
	FileInputStream fis=new FileInputStream("./test data/friends.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(2).getCell(1).setCellValue("updateValue");
	FileOutputStream fos=new FileOutputStream("./test data/friends.xlsx");
	wb.write(fos);
	wb.close();
	
}
}
