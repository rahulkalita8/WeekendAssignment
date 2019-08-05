
import java.util.Calendar; 
import java.util.GregorianCalendar; 
import java.util.Scanner;

class TwentyOneUserMainCode {
	
	public static String getDay(String date) {
		int year, month, day;
		String[] dateSeperated = date.split("-");
		month = Integer.parseInt(dateSeperated[0]);
		day = Integer.parseInt(dateSeperated[1]);
		year = Integer.parseInt(dateSeperated[2]);
		String days[] = {"Invalid","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		Calendar calendar = new GregorianCalendar(year, month - 1, day); 
        return days[calendar.get(Calendar.DAY_OF_WEEK)];
	}
}

public class TwentyOne {
	public static void main(String[] args) {
		System.out.println("Enter date (mm-dd-yyyy):");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		System.out.println(TwentyOneUserMainCode.getDay(date));
		in.close();
	}
}