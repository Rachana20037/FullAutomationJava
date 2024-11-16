package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindependent {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("iphone 15");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String text1=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 256 GB)']")).getText();
	String text2=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Black, 256 GB)']/../../../div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
	System.out.println(text1+text2);
	Thread.sleep(5000);
	driver.close();
}
}
