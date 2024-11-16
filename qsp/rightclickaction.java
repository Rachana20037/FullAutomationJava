package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclickaction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[.='Button']")).click();
	driver.findElement(By.linkText("Right Click")).click();
	WebElement element = driver.findElement(By.xpath("(//button[.='Right Click'])[1]"));
Actions a=new Actions(driver);
a.contextClick(element).perform();
driver.findElement(By.xpath("//div[.='Yes']")).click();
Thread.sleep(2000);
driver.close();
}
}
