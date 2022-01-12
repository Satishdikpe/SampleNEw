
public class Test1 {
String title = "welcom to amazon";
String url = "www.amazon.in";
String header = "Amazon.in mobile";
String logoImage= "www.amazon.com/reg.nav_logo";

public void topPannel()
{ 
System.out.println("------Top pannel start------");
System.out.println(url);
System.out.println("this is top pannel");
System.out.println(title);
System.err.println(logoImage);;
}
public void topPannel1()
{
	System.out.println("-------centrl pannel--------------");
System.out.println("Mobile");
System.out.println("laptop");
System.out.println("books");
System.out.println("kitchens");
System.out.println("---------end of centre pannel");
}

public void footerlinks()
{
	System.out.println("------footerlink---------");
	System.out.println("Links - 1");
	System.out.println("links - 2");
	System.out.println("links - 3");
	System.out.println("----------end of footer-------");
	}
public static void helpSection()
{
	System.out.println("--------help section ---------");
	System.out.println("about application");
	System.out.println("location");
	System.out.println("---------end of help section-------");}

public static void main(String[] args) {
	Test1 t = new Test1();
	t.topPannel();
	t.topPannel1();
	t.footerlinks();
	t.helpSection();
	
}
}