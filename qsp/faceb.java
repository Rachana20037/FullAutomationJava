package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class faceb {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
	String url=driver.getCurrentUrl();
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	String title=driver.getTitle();
	Thread.sleep(5000);
	System.out.println(title);
	Thread.sleep(5000);
	driver.close();
}
}
