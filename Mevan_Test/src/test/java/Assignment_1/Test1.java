package Assignment_1;

import java.util.Scanner;

//
public class Test1 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Enter your number");
	int b = s.nextInt();
	if (b<300) {
		System.out.println("Number is less than equal to 300 i.e. "+b);
	}
	else if(b>300)
	{
		System.out.println("Number is greater than 300 i.e."+b);
	}
	else
	{
		System.out.println("you entered number is 300");
	}
}
}
