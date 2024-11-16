package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindependenta {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	driver.findElement(By.name("field-keywords")).sendKeys("iphone 15");
	driver.findElement(By.id("nav-search-submit-button")).click();
	String text1=driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]")).getText();
String text =driver.findElement(By.xpath("(//span[text()='Apple iPhone 15 (128 GB) - Black'])[1]/../../../../../../../div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]")).getText();
System.out.println(text1+text);
Thread.sleep(5000);
driver.close();
 }
}
