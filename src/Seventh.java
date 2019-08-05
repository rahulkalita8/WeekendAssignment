import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;


class SeventhUserMainCode {
	
	static boolean isEligible(String startDate) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		long years = ChronoUnit.YEARS.between(LocalDate.parse(startDate, formatter), LocalDate.parse("01/01/2014", formatter));
		return years >= 60;
	}
	
	public static ArrayList<String> retirementEmployeeList (HashMap<String, String> hmap) {
		ArrayList<String> list = new ArrayList<>();
		hmap.forEach((k,v) -> {
			if(isEligible(v))
				list.add(k);
		});
		return list;
	}
}


public class Seventh {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Enter number of Employee");
		size = scan.nextInt();
		HashMap<String, String> hmap = new HashMap<>();
		for(int i=0; i<size; i++) {
			System.out.println("Enter ID and DOB for employee "+ (i+1));
			String a = scan.next();
			String b = scan.next();
			hmap.put(a, b);
		}
		System.out.println(SeventhUserMainCode.retirementEmployeeList(hmap));
		scan.close();
	}
}
