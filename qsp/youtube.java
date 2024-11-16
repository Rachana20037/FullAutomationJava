package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(5000);
//	driver.get("https://www.amazon.com/");
	driver.get("https://www.youtube.com/");
	Thread.sleep(5000);
	driver.close();
}
}
