import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo { 
	public static void main(String args[]){
	ArrayList <String> al = new ArrayList<String>();
	al.add ("Asia");
	al.add ("North America");
	al.add ("South America");
	al.add ("Africa");
	al.add ("Europe");
	al.add (1,"Australia");
	al.add (2,"Antarctica");
	System.out.print ("Size of the Array List is: " + al.size ());
	System.out.print ("\nRetrieving elements in ArrayList using Iterator :");
	Iterator<String> it = al.iterator ();
	while (it.hasNext () )
	System.out.print (it.next () + "\t");
	}

}
