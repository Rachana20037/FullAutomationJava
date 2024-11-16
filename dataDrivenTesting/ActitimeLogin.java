package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
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
Thread.sleep(5000);
driver.close();
	
	
}
}
