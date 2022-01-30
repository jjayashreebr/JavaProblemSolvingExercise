package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// current date..current time./
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());
	
		
		Calendar c = Calendar.getInstance();
		System.out.println(sdf.format(c.getTime()));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.toString());
		

	}

}
