package qsp;
                                       //26 jun
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathby {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("hp laptop");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(3000);
	String text=driver.findElement(By.xpath("//div[contains(text(),'HP 15s (2023) Intel Core i5 13th Gen 1335U ')]")).getText();
    System.out.println(text);
    Thread.sleep(5000);
    driver.close();
}
}
