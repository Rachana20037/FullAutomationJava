package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customwait {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	int i=0;
	while (i<500) {
		try {
			driver.findElement(By.xpath("//section[.='Dropdown']")).click();
			break;
		} catch (Exception e) {
			i++;
		}
	}
	Thread.sleep(5000);
	driver.close();
	
}
}
