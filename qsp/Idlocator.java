package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/HARSHADA%20CHAVAN/OneDrive/Desktop/link.html");
	Thread.sleep(2000);
	driver.findElement(By.id(""));
	
	
}
}
