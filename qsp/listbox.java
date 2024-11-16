package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
	Thread.sleep(5000);
	WebElement country=driver.findElement(By.id("select3"));
	Select s=new Select(country);
	s.selectByValue("India");
	WebElement state=driver.findElement(By.id("select5"));
	Select s1=new Select(state);
	s1.selectByValue("Maharashtra");
	Thread.sleep(3000);
	driver.close();
	
	
}
}
