package Stringandswitch;

public class Array {
public static void main(String[] args) {
	int a[] = {10,20,30,40};
	String ab[]=new String[3];
	ab[0]="Satish";
	ab[1]= " Dipke";
	ab[2]="Manisha";
	for (int i = 0; i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
	for(int i = ab.length-1;i>=0;i--)
	{
		System.out.println(ab[i]);
	}
}
}
