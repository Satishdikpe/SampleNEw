package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Test9 {
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add("SAtish");
	a1.add("Dipke");
	a1.add("Manisha");
	a1.add("Dipke");
System.out.println("before swapping"+a1);
Collections.swap(a1, 0, 3);
System.out.println("aftr swapping"+a1);
ArrayList<String> a2 = new ArrayList<>(a1.subList(1, 4));
a1.add("Srujan");
System.out.println("Bfor sublist"+a2);

}
}
