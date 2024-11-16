package testNextGeneration;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Actitime.GenericLibarary.FileLibrary;

public class Baseclass {
	 public static WebDriver driver;
	FileLibrary f=new FileLibrary();
	@BeforeSuite
	public void databaseconnect() {
		Reporter.log("database connected successfully",true);
	}
	@BeforeTest
	public void launchbrowser() throws IOException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("launch browser successfully",true);
	}
	@BeforeMethod
	public void login() throws IOException {
		String UN = f.readDataFromPropertyFile("un");
		driver.findElement(By.id("username")).sendKeys(UN);
		String PWD = f.readDataFromPropertyFile("pwd");
		driver.findElement(By.name("pwd")).sendKeys(PWD);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("logged in successfully",true);
	}
	@Test
	public void createcustomer() {
		Reporter.log("hello",true);
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logged out successfully",true);
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
		Reporter.log("browser close successfully",true);
	}
	@AfterSuite
	public void databasedisconnect() {
		Reporter.log("database disconnect",true);
	}
}
