package testNextGeneration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook {
@Test
public void facebook() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("");
	WebElement element = driver.findElement(By.id("email"));
	driver.navigate().refresh();
	element.sendKeys("harshu@2112");
	Thread.sleep(5000);
	driver.close();
}
}
