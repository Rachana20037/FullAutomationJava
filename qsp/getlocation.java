package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlocation {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(5000);
	 int xaxis =driver.findElement(By.id("name")).getLocation().getX();
	int yaxis =driver.findElement(By.id("name")).getLocation().getY();
	System.out.println(xaxis);
	System.out.println(yaxis);
	driver.close();
}
}
