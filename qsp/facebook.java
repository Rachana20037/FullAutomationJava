
package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();        //launched the chrome
	driver.manage().window().maximize();           //maximize
	driver.get("https://www.facebook.com/");           //navigate
	String page=driver.getPageSource();                        //entire pagesource
	System.out.println(page);                                //console
    Thread.sleep(5000);                               //wait
	driver.close();                                    //close
}
}
