package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
driver.findElement(By.xpath("//section[.='Frames']")).click();
driver.findElement(By.xpath("//section[.='iframes']")).click();
Thread.sleep(5000);
driver.switchTo().frame(0);
driver.findElement(By.id("username")).sendKeys("harshada2112@gmail.com");
Thread.sleep(5000);
driver.close();
}
}
