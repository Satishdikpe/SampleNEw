import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Test1 {
public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String>();
	al.add("Satish");
	al.add("Dipke");
	al.add("Manisha");
	al.add("ALane");
	System.out.println("Before sorting"+al);
Collections.sort(al);
System.out.println("After Sorting"+al);

LinkedList<Integer> ll = new LinkedList<Integer>();
ll.add(10);
ll.add(3);
ll.add(20);
ll.add(26);
System.out.println("before sorting"+ll);
Collections.sort(ll);
System.out.println("after Sorting"+ll);
}

}
