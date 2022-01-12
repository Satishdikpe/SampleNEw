package wrapper;

public class Test1 {
public static void main(String[] args) {
	int a = 100;
	String b = "200";
	String c = "10.5";
	String d = "11.4f";
	String e = "$200";
	System.out.println(Integer.parseInt(b)+a);
	System.out.println(String.valueOf(a)+b);
	System.out.println(Double.parseDouble(c)+a);
	System.out.println(Float.parseFloat(d)+Double.parseDouble(c)+a);
	String f = e.replace("$", "0");
	System.out.println(Integer.parseInt(f)+Double.parseDouble(d));
}
}
