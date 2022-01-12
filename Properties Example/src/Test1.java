
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test1 {
public static void main(String[] args) throws IOException {
	//Load the property file
	FileInputStream fis = new FileInputStream("abc.properties");
	
	Properties properties = new Properties();
	properties.load(fis);
	
	//Read the data from property file
	System.out.println(properties.getProperty("username"));
	System.out.println(properties.getProperty("password"));
}
}
