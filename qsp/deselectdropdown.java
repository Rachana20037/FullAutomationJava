package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectdropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(3000);
driver.findElement(By.xpath("//section[.='Dropdown']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[.='Multi Select']")).click();
Thread.sleep(3000);
WebElement country =driver.findElement(By.id("select-multiple-native"));
Select s=new Select(country);
s.selectByIndex(6);
s.selectByValue("Canada");
s.selectByVisibleText("China");
s.selectByValue("Poland");
Thread.sleep(3000);
//s.deselectByIndex(6);
//s.deselectByVisibleText("Canada");
//s.deselectByValue("Poland");
//s.deselectByValue("China");
//s.deselectAll();
//   String option=s.getFirstSelectedOption().getText(); 
   //for printing

List<WebElement>alloptions=s.getAllSelectedOptions();
int count=alloptions.size();
for (int i = 0; i < count; i++) {
	
	String option=alloptions.get(i).getText();
	System.out.println(option);
	
}
Thread.sleep(5000);
driver.close();
}
}
