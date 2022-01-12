package sss;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test2 {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("xyz.properties");
	Properties properties = new Properties();
	properties.load(fis);
	
	System.out.println(properties.getProperty("username"));
	System.out.println(properties.getProperty("password"));
	
}
}
