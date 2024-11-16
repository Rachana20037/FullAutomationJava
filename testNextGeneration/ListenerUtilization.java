package testNextGeneration;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listenerimplementation.class)
public class ListenerUtilization extends Baseclass{
	
    @Test
    public void create() {
	Reporter.log("create customer",true);
	Assert.fail();
}
@Test
public void delete() {
	Reporter.log("customer deleted",true);
	Assert.fail();
}
    
}
