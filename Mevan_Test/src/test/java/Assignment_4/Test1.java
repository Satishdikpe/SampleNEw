package Assignment_4;

public class Test1 {
public static void main(String[] args) {
	String s = "Hello Everyone there";
String[] s1 = s.split(" ");
for (int i = s1.length-1; i >= 0; i--) {
	System.out.println(s1[i]);
}
char[] b = s.toCharArray();
for (int i = b.length-1; i >=0 ; i--) {
	System.out.println(b[i]);
}
}
}
