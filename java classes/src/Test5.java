
public class Test5 {
	
	public String[] m1()
	{
	String a[] = new String[3];
	a[0]="Satish";
	a[1]="Dipke";
	a[2]="Manisha";
	return a;
	}
	public static void main(String[] args) {
		Test5 t = new Test5();
		String[] s = t.m1();
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}

	
}
