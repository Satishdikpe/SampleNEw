import java.util.LinkedHashSet;

public class Test3 {
public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
lhs.add("Satish");
lhs.add("Dipke");

LinkedHashSet<String> lhs1 = new LinkedHashSet<String>(lhs);

lhs1.add("Manisha");
lhs1.add("Alane");
System.out.println(lhs1);

LinkedHashSet<String> lhs2 = new LinkedHashSet<String>();

lhs2.add("Hingoli");
LinkedHashSet<String> lhs3 = new LinkedHashSet<String>();

lhs3.add("Parbhani");
LinkedHashSet<String> lhs4 = new LinkedHashSet<String>();

lhs4.addAll(lhs2);
lhs4.addAll(lhs3);
lhs4.add("vasmat");
System.out.println(lhs4);
}
}