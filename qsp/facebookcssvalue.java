package qsp;
                                //3 jul
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookcssvalue {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	 String text =driver.findElement(By.id("email")).getCssValue("color");
	System.out.println(text);
	 Thread.sleep(5000);
	driver.close();
}
}
