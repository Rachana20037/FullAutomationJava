package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.navigate().to("https://www.instagram.com/");
driver.findElement(By.id("email")).sendKeys("harshada2112");
driver.findElement(By.id("password")).sendKeys("harshu");
Thread.sleep(5000);
driver.close();
}
}
