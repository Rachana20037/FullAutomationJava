package qsp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[.='Popups']")).click();
	driver.findElement(By.xpath("//section[.='File Uploads']")).click();
	File f=new File("./test data/HARSHADAC.pdf");
	String path=f.getAbsolutePath();
	Thread.sleep(5000);
	driver.findElement(By.id("fileInput")).sendKeys(path);
	Thread.sleep(5000);
	driver.close();
	

}
}
