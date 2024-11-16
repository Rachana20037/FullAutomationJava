package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleboolean {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
//	Thread.sleep(5000);
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
	driver.findElement(By.linkText("Multi Select")).click();
	WebElement country=driver.findElement(By.id("select-multiple-native"));
	Select s=new Select(country);
	Boolean output=s.isMultiple();
	if(output==true) {
		System.out.println("dropdown is multiple");
	}
	else {
		System.out.println("dropdown is single");
	}
//	Thread.sleep(5000);
	driver.close();
}
}
