package Assignment_3;

import java.util.Scanner;

public class Test1 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please type what you want to do add/sub/multi/div");
	String s1 = s.nextLine();
	Add aa = new Add();
	Sub ss= new Sub();
	multi mm = new multi();
	Div dd = new Div();
	
	if(s1.equalsIgnoreCase("add"))
	{
	aa.add();	
	}
	else if(s1.equalsIgnoreCase("sub"))
	{
		ss.sub();
	}
	else if(s1.equalsIgnoreCase("multi"))
	{
		mm.multi();
	}
	else if(s1.equalsIgnoreCase("Div"))
	{
	dd.div();	
	}
	else
	{
		System.out.println("invalid entry");
	}
}
}
