package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveraction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	WebElement element = driver.findElement(By.partialLinkText("Company"));
	a.moveToElement(element).perform();
	driver.findElement(By.partialLinkText("Contact")).click();
	Thread.sleep(3000);
	String mobileno = driver.findElement(By.xpath("//p[contains(text(),'9243602352')]")).getText();
	System.out.println(mobileno);
	Thread.sleep(2000);
	driver.close();
}
}
