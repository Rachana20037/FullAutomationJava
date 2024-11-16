package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./test data/commondata.property");
Properties p=new Properties();
p.load(fis);
String data = p.getProperty("url");
System.out.println(data);
}
}
