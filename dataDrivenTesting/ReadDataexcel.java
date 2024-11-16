package dataDrivenTesting;

import java.io.IOException;

public class ReadDataexcel {
public static void main(String[] args) throws IOException {
	GenericMethod g=new GenericMethod();
	String EXCEL = g.readDataFromExcel("Sheet1", 2, 1);
	System.out.println(EXCEL);
	
}
}
