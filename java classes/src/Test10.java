import java.util.Scanner;

public class Test10 {
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);	
	System.out.println("Enter you number");
	int x = s.nextInt();
	
	
	Scanner s1 = new Scanner(System.in);	
	System.out.println("Enter you number");
	int y = s1.nextInt();
	
	Test6 t1 = new Test6();
	int xx = t1.m1(x, y);
	System.out.println(xx);
	
	
}
}
