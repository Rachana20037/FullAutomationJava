package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getalloption {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//section[.='Dropdown']")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Multi Select")).click();
	Thread.sleep(3000);
	WebElement country=driver.findElement(By.id("select-multiple-native"));
    Select s=new Select(country);
//   String option=s.getWrappedElement().getText();
//   System.out.println(option);
   
  List<WebElement> alloptions= s.getOptions();
  int count =alloptions.size();                 //using loop
  for (int i = 0; i < count; i++) {
	String option=alloptions.get(i).getText();
	System.out.println(option);
}
   Thread.sleep(5000);
   driver.close();

	
}
}
