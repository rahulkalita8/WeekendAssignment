
import java.util.Scanner;


class EightUserMainCode {
	public static int getKaprekarNumber(int num) {
		int square = num*num;
		int d = String.valueOf(num).length();
		String str = String.valueOf(square);
		String firstHalf = str.substring(0, d);
		String secondHalf = str.substring(d);
		if(Integer.parseInt(firstHalf) + Integer.parseInt(secondHalf) == num)
			return 1;
		return -1;
	}
}

public class Eigth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		if(num<=3 || EightUserMainCode.getKaprekarNumber(num) == -1)
			System.out.println("Not A Kaprekar Number");
		else
			System.out.println("Kaprekar Number");
		scan.close();
	}
}
