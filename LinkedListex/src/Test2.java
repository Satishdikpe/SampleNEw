import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test2 {
public static void main(String[] args) {
	LinkedList<Book> ll = new LinkedList<Book>();
	ll.add(new Book(111,"My Life","Satish"));
	ll.add(new Book(112,"My family","Satish"));
	ll.add(new Book(113,"My bike","Satish"));
	ll.add(new Book(114,"My house","Satish"));
System.out.println(ll);
ListIterator<Book> itr = ll.listIterator();
for (Book bk : ll) {
	System.out.println(bk.Bookid+"-----"+bk.Bookname+"-------"+bk.BookAurther);
}
while(itr.hasNext())
{ Book b = itr.next();
if(b.Bookname.equals("My bike"))
	itr.remove();	

}
for (Book b : ll) {
	System.out.println(b.Bookid+"-----"+b.Bookname+"-------"+b.BookAurther);
}
}
}

