package collections;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test1 {
public static void main(String[] args) {
	ArrayList ar = new ArrayList();
	ar.add("Satish");
	ar.add("Dipke");
	ar.add(111);
	ar.add(222);
	ar.add("Hingoli");
	
	System.out.println(ar.size());
	ar.remove(3);
	System.out.println(ar.size());
	for (int i = 0; i < ar.size(); i++) {
		Object ar1 = ar.get(i);
		if(ar1=="Dipke")
		{
			ar.remove(i);
		}
		System.out.println(ar.get(i));	
	}
	ar.clear();
	
	boolean bb = ar.isEmpty();
	System.out.println(bb);
	
}
}
