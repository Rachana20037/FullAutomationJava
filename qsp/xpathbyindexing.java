package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbyindexing {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("azira ethnics dresses");
	driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconSearch sprites-search']")).click();
    driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]")).click();
    Thread.sleep(5000); 
    driver.close();
}
}
