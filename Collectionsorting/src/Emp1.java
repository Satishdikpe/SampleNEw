
public class Emp1 implements Comparable<Emp1>{


int eid;
String ename;
public Emp1(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}
public int compareTo(Emp1 o) {
	return ename.compareTo(o.ename);
}
}

