import java.util.Stack;

public class Test1 {
public static void main(String[] args) {
Stack<String> s = new Stack<String>();	
s.push("Satish");
s.push("Dipke");
s.push("manisha");
s.push("alane");
System.out.println(s);
System.out.println(s.search("alane"));
s.pop();
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.empty());
s.clear();
System.out.println(s.empty());
}
}
