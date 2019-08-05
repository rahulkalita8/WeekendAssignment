import java.util.Scanner;
import java.util.StringTokenizer;

class SixteenthUserMainCode{
	public static String  findOldDate (String dateOne, String dateTwo) {
		StringTokenizer dateOneSeperated = new StringTokenizer(dateOne,"-");
		StringTokenizer dateTwoSeperated = new StringTokenizer(dateTwo,"-");
		int dayOne = Integer.parseInt(dateOneSeperated.nextToken()) ;
		int monthOne = Integer.parseInt(dateOneSeperated.nextToken()) ;
		int yearOne = Integer.parseInt(dateOneSeperated.nextToken()) ;
		int dayTwo = Integer.parseInt(dateTwoSeperated.nextToken()) ;
		int monthTwo = Integer.parseInt(dateTwoSeperated.nextToken()) ;
		int yearTwo = Integer.parseInt(dateTwoSeperated.nextToken()) ;
		boolean flag=false;
		if(yearOne<yearTwo) flag=true;
		else if (yearOne==yearTwo && monthOne<monthTwo) flag=true;
		else if (yearOne==yearTwo && monthOne==monthTwo && dayOne<dayTwo) flag=true;
		if(flag) return monthOne+"/"+dayOne+"/"+yearOne;
		else return monthTwo+"/"+dayTwo+"/"+yearTwo;
	}
	
}
public class Sixteenth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter date one");
		String dateOne = scan.nextLine();
		System.out.println("Enter date two");
		String datetwo = scan.nextLine();
		System.out.println("Difference is :" + SixteenthUserMainCode.findOldDate(dateOne, datetwo));
		scan.close();
	}

}
