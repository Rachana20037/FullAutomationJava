package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {
public static void main(String[] args) throws InterruptedException {
	WebDriver d= new ChromeDriver();     //launch browser
  d.manage().window().maximize();
	d.navigate().to("http://127.0.0.1:5500/webpage.html");
	Thread.sleep(3000);
	d.findElement(By.id(null)).click();
	Thread.sleep(3000);
	d.navigate().back();
	Thread.sleep(3000);
	d.findElement(By.id(null)).click();
	Thread.sleep(3000);
	d.navigate().back();
	Thread.sleep(3000);
	d.navigate().forward();
	Thread.sleep(3000);
	d.navigate().refresh();
	Thread.sleep(5000);
	d.close();
	
	
	
}
}
