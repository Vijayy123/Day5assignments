import java.util.Calendar;

public class Cal {
	public static void main(String args[]) {
		Calendar cl = Calendar.getInstance();
		int dd = cl.get(Calendar.DATE);
		int mm = cl.get(Calendar.MONTH);
		++mm;
		int yy = cl.get(Calendar.YEAR);
		System.out.println("Current Date is : " + dd + "-" + mm + "-" + yy);
		int hh = cl.get(Calendar.HOUR);
		int mi = cl.get(Calendar.MINUTE);
		int ss = cl.get(Calendar.SECOND);
		System.out.println("Current Time is : " + hh + ":" + mi + ":" + ss);
	}

}
