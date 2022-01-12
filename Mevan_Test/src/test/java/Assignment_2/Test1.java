package Assignment_2;

import java.util.Scanner;

public class Test1
{
	String m1()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int a = s.nextInt();
		if(a==1) {System.out.println("Monday");}
		else if(a==0) {System.out.println("Sunday");}
		else if(a==2) {System.out.println("Tuesday");}
		else if(a==3) {System.out.println("Thursday");}
		else if(a==4) {System.out.println("Friday");}
		else { System.out.println("Invalid Number");}
		return "Null";
	}
	
	public static void main(String[] args) {
	Test1 t = new Test1();
	t.m1();
	}
	
	}
