package testNextGeneration;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
@BeforeSuite
public void databaseconnect() {
	Reporter.log("database connected successfully",true);
}
@BeforeTest
public void launchbrowser() {
	Reporter.log("launch browser successfully",true);
}
@BeforeMethod
public void login() {
	Reporter.log("logged in successfully",true);
}
@Test
public void createcustomer() {
	Reporter.log("customer created successfully",true);
}
@AfterMethod
public void logout() {
	Reporter.log("logged out successfully",true);
}
@AfterTest
public void closebrowser() {
	Reporter.log("browser close successfully",true);
}
@AfterSuite
public void databasedisconnect() {
	Reporter.log("database disconnect",true);
}
}
