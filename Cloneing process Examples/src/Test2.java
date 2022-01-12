import java.util.ArrayList;

public class Test2 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Satish");
	al.add("Mansiha");
	al.add("Dipke");
	ArrayList al1 =(ArrayList)al.clone();
al1.add("Satish");
al1.add("Manisha");
al1.add("Dipke");
System.out.println(al1);
}
}
