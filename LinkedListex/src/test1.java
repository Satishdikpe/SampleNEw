import java.util.LinkedList;

public class test1 {
public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>();
ll.add("Satish");
ll.add("Dipke");
ll.add("Manisha");
ll.add("Alane");
ll.add(null);
System.out.println(ll);
ll.addFirst("Hingoli");
ll.addLast("Pune");
System.out.println(ll);
System.out.println(ll.size());
ll.add(2,"Rambhau");
System.out.println(ll);
ll.set(5, "Dipke");
System.out.println(ll);

ll.remove(5);
ll.remove("Alane");
ll.removeFirst();
ll.removeLast();
System.out.println(ll);

System.out.println(ll.isEmpty());
ll.clear();
System.out.println(ll.isEmpty());
}
}
