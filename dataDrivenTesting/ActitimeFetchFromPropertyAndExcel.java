package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeFetchFromPropertyAndExcel {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileInputStream fis=new FileInputStream("./test data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String URL = p.getProperty("url");
	driver.get(URL);
	String UN = p.getProperty("un");
	driver.findElement(By.id("username")).sendKeys(UN);
	String PWD = p.getProperty("pwd");
	driver.findElement(By.name("pwd")).sendKeys(PWD);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	driver.findElement(By.xpath("//div[.='Tasks']")).click();
	driver.findElement(By.xpath("//div[.='Add New']")).click();
	driver.findElement(By.xpath("//div[.='+ New Customer']")).click();
	
	FileInputStream fis1=new FileInputStream("./test data/friends.xlsx");
	Workbook wb = WorkbookFactory.create(fis1);
	String name = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("")).sendKeys(name);
	
	String desc = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("")).sendKeys(desc);
	Thread.sleep(5000);
	driver.close();
	
	
	
	
	
}
}
