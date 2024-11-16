package qsp;
                                //22 jun
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webapp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
  driver.findElement(By.id("email")).sendKeys("harshuchavan2112@gmail.com");
 driver.findElement(By.id("pass")).sendKeys("Harshada@2112");
 Thread.sleep(5000);
 driver.close();
}
}
