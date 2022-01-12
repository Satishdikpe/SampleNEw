
public class Test9 {
String factory(String factoryname)
{
if(factoryname.equals("Puma"))
{
String name = "@@Puma";
System.out.println("Factory Puma");
return name;
}
else if(factoryname.equals("Nike"))
{
String name = "@@Nike@@";
System.out.println("Factory Nike");
return name;
}
return "No factory found";
}
public static void main(String[] args) {
	Test9 t = new Test9();
	String s = t.factory("Nike");
	System.out.println(s);
}
}
