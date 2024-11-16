package qsp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[.='Popups']")).click();
	driver.findElement(By.xpath("//section[.='Javascript']")).click();
	driver.findElement(By.linkText("Confirm")).click();
	driver.findElement(By.xpath("//button[.='Confirm Box']")).click();
	 Alert a=driver.switchTo().alert();
	 String text=a.getText();
	 System.out.println(text);
   a.accept();
   Thread.sleep(5000);
   driver.close();
}
}