class Test
{
public String[] m1()
{
String a[] = new String[3];
a[1]="Satish";
a[2]="Dipke";
a[3]="Manisha";
return a;
}
public static void main(String[] args) {
	Test t = new Test();
	String[] s = t.m1();
	System.out.println(s);
	System.out.println("-------------");
	System.out.println(t.m1());
}

}
