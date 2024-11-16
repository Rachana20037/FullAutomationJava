package testNextGeneration;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Titleverification {
@Test
public void title() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	String expectedtitle = "Facebook";
	String actualtitle = driver.getTitle();
//	Assert.assertEquals(actualtitle,expectedtitle );  it is used for hard assert and soft assert
	SoftAssert s=new SoftAssert();
	s.assertNotEquals(actualtitle, expectedtitle);
	
	Thread.sleep(5000);
	driver.close();
}
}
