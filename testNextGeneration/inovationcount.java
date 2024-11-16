package testNextGeneration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class inovationcount {
	@Test(invocationCount=5,priority=2,groups="smoke")
	public void create() {
		System.out.println("hello");
		Reporter.log("hii",true);
	}
	@Test(priority=0,groups="regression")
	public void delete() {
		Assert.fail();
		Reporter.log("customer deleted",true);
	}
	@Test(priority=1,groups={"smoke","regression"})
	public void add() {
		Reporter.log("customer added",true);
	}
}
