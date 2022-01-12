package Stringandswitch;

import java.util.Iterator;
import java.util.stream.IntStream;

public class Test2 {
public static void main(String[] args) {
	String str = "  My Name is miss AppleBerry. ";
System.out.println(str.trim());
System.out.println("-----------------------");
System.out.println(str.charAt(6));
System.out.println("-----------------------");
System.out.println(str.contains("miss"));
System.out.println("-----------------------");
System.out.println(str.length());
System.out.println("-----------------------");
System.out.println(str.replace("miss","Kiss"));
System.out.println("-----------------------");
System.out.println(str.indexOf("miss"));
System.out.println("-----------------------");
System.out.println(str.endsWith("AppleBerry"));
System.out.println("-----------------------");
System.out.println(str.startsWith("My"));
System.out.println("-----------------------");
System.out.println(str.indexOf("miss"));
System.out.println("-----------------------");
System.out.println(str.toLowerCase());
System.out.println("-----------------------");
System.out.println(str.toUpperCase());
System.out.println("-----------------------");
System.out.println(str.substring(18));
String str1 = str.substring(18);
System.out.println("Mera naaam hai"+str1+"Mai hu teacher");
System.out.println("-----------------------");
System.out.println("Substring"+str.substring(13, 23));
System.out.println("-----------------------");
String str3 = " Java is object oriented programming language ";
String[] str4 = str3.split(" ");
for(int i=0;i<str4.length;i++)
{
System.out.println(str4[i]);	
}
System.out.println("-----------------------");

for(int i=str4.length-1;i>=0;i--)
{
System.out.println(str4[i]);	
}
System.out.println("-----------------------");

}
}
