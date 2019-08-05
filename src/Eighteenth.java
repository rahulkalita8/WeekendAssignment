import java.util.Scanner;

class EighteenthUserMainCode{
	public static int  validatePAN (String str) {
		if(str.length()!=8) return -1;
		
		if(str.substring(0, 3).matches("^[a-zA-Z]*$")
			&& str.substring(3, 7).matches("^[0-9]*$")
			&& str.substring(7, 8).matches("^[a-zA-Z]*$")){
				return 1;
		}
		return -1;
	}
	
}
public class Eighteenth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String panNum = scan.nextLine();
		if(EighteenthUserMainCode.validatePAN(panNum) == 1 ) 
			System.out.println("Valid");
		else System.out.println("Invalid");
		scan.close();
	}

}
