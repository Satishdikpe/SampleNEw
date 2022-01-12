
import java.util.SortedSet;
import java.util.TreeSet;

public class test8 {
public static void main(String[] args) {
	TreeSet<Integer> tr = new TreeSet<Integer>();
	for(int i=0;i<10;i++)
	{ tr.add(i);
		}
	System.out.println(tr);
	
	SortedSet<Integer> tr1 = tr.subSet(3,7);
TreeSet<Integer> t1 = new TreeSet<Integer>(tr1);
System.out.println(t1);

SortedSet<Integer> s = tr.tailSet(3);
TreeSet<Integer> t2 = new TreeSet<Integer>(s);
System.out.println(t2);

SortedSet<Integer> s3=  tr.headSet(7);
TreeSet<Integer> t3 = new TreeSet<Integer>(s3);
System.out.println(t3);
}}