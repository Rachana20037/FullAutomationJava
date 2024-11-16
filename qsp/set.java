package qsp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class set {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
    String pwin=driver.getWindowHandle();
	driver.findElement(By.xpath("//section[.='Popups']")).click();
	driver.findElement(By.xpath("//section[.='Browser Windows']")).click();
	driver.findElement(By.linkText("Multiple Windows")).click();
	driver.findElement(By.xpath("//button[.='Click to open multiple popup windows']")).click();
 Set<String>allwinid=driver.getWindowHandles();
 for (String win : allwinid) {
     driver.switchTo().window(win);
     if(!pwin.equals(win)) {
	 driver.close();
	 Thread.sleep(3000);
 }
 }
 
}
}





