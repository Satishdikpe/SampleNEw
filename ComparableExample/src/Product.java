
public class Product implements Comparable {
int pid;
String pname;
int pcost;
public Product(int pid, String pname, int pcost) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pcost = pcost;
}
@Override
public int compareTo(Object o) {
	Product p = (Product)o;
if(pid==p.pid)
return 0;
if(pid>p.pid)
return 1;
else
	return -1;
}

}
