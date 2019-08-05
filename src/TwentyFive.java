
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

class TwentyFiveUserMainCode {
	
	public static String getAge(String date) {
		int i1 = date.indexOf('/');
		int i2 = date.lastIndexOf('/');
		int dd = Integer.parseInt(date.substring(0, i1));
		int mm = Integer.parseInt(date.substring(i1+1,i2));
		int yy = Integer.parseInt(date.substring(i2+1));
		LocalDate today = LocalDate.of(2015, Month.JANUARY, 01);                      
		LocalDate birthday = LocalDate.of(yy, mm, dd);  
		Period period = Period.between(birthday, today);
		if (period.getYears()>=18) 
			return "Eligible";
		return "Not-Eligible";
	}
}

public class TwentyFive {
	public static void main(String[] args) {
		System.out.println("Enter date (dd/MM/yyyy):");
		Scanner in = new Scanner(System.in);
		String date = in.next();
		System.out.println(TwentyFiveUserMainCode.getAge(date));
		in.close();
	}
}