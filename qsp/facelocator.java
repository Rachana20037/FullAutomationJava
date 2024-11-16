package qsp;
         //22 jun

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facelocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
  driver.navigate().to("http://127.0.0.1:5500/webpage.html");
  driver.findElement(By.tagName("img")).click();
  Thread.sleep(5000);
  driver.close();
}
}
