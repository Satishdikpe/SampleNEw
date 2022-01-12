package Vectors;

import java.util.ArrayList;
import java.util.Vector;

public class Test {
public static void main(String[] args) {
	ArrayList<String> a1=new ArrayList<>();
	a1.add("aaa");
	a1.add("bbb");
		
	Vector<String> v =new Vector<String>(a1);
v.add("Satish");
v.add("Dipke");
v.add("Manisha");
v.add("Alane");
System.out.println(v);
System.out.println(v.capacity());
}
}
