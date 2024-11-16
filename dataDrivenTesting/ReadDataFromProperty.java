package dataDrivenTesting;

import java.io.IOException;

public class ReadDataFromProperty {
public static void main(String[] args) throws IOException {
	GenericMethod g =new GenericMethod();
	String URL = g.readDataFromPropertyFile("url");
	System.out.println(URL);

}
}