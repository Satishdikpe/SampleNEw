package Assignment_1;

import java.util.Scanner;

public class Test2 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Please write you bill amount");
	int bill = s.nextInt();
	if(bill >= 300 && bill <= 500 )
	{
		int a = bill + 50;
	System.out.println("After tax bill"+a);
	}
	
	else if (bill > 500 && bill <= 1000 )
	{
		int a = bill + 20;
	System.out.println("after tax bill "+a);	
	}
		else 
	{
		int a = bill + 10;
		System.out.println("after tax bill "+a);
	}
}
}
