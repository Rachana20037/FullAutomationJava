package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathh {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.name("search_query")).sendKeys("tere sang ishq hua");
	driver.findElement(By.id("search-icon-legacy")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
     driver.close();
}
}
