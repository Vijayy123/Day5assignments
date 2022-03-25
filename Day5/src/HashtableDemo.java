import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {

	@SuppressWarnings("removal")
	public static void main(String args[]) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put (101, "Naresh");
		ht.put (102, "Rajesh");
		ht.put (103, "Suresh");
		ht.put (104, "Mahesh");
		ht.put (105, "Ramesh");
		Enumeration<Integer> e = ht.keys();
		while (e.hasMoreElements()) {
			Integer i1 = (Integer) e.nextElement();
			System.out.println(i1 + "\t" + ht.get(i1));
		}
	}

}
