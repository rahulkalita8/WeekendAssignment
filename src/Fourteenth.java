import java.util.Scanner;

class FourteenthUserMainCode{
	
	static boolean validatePassword(String str){
		if(!str.matches(".*[a-zA-Z]+.*")){
			return false;
		}
		if(!str.matches(".*[0-9]+.*")){
			return false;
		}
		if(!str.matches(".*[#$@%?+^]+.*")){
			return false;
		}
		return true;
	}
	
}

public class Fourteenth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		if(FourteenthUserMainCode.validatePassword(password))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		scan.close();
	}
	
}
