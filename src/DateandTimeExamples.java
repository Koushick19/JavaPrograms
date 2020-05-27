import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateandTimeExamples {
	
	
	public static void main(String[] args) {
		
		
		Date date = new Date();
		
		System.out.println("toString() date is " + date);
		
		SimpleDateFormat dateFormatter = new SimpleDateFormat("E, y-M-d 'at' h:m:s a z");
	      System.out.println("Format 1:   " + dateFormatter.format(date));

	      dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Format 2:   " + dateFormatter.format(date));
	      
	      dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	      System.out.println("Format 3:   " + dateFormatter.format(date));
	      
	      
	      Calendar cal = Calendar.getInstance();
	      
	      System.out.println(cal.getWeekYear());
	      System.out.println(cal.getCalendarType());
	      
	      int Mon = cal.get(Calendar.DAY_OF_MONTH);
	      int year = cal.get(Calendar.DAY_OF_YEAR);
	      int ErA = cal.get(Calendar.ERA);
	      
	      System.out.println("The Month is " + Mon);
	      System.out.println("The Month is " + year);
	      System.out.println("The Month is " + ErA);
	      
	      
	      Date tim = cal.getTime();
	      
	      System.out.println("The Time is " + tim);
		
//		System.out.println("The Date is " + date.getDate());
//		System.out.println("The Date is " + date.getDay());
//		System.out.println("The Date is " + date.getHours());
		
	}

}
