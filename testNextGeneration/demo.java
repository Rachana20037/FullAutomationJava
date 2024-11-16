package testNextGeneration;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
     @Test
     public void create() {
    	 System.out.println("hello");
    	 Reporter.log("hii",true);
    	 Reporter.log("bye",false);
    	 Reporter.log("bye bye");
     }

}
