import java.util.Scanner;

class ThirteenthUserMainCode{
	static String swapPairs(String str){
		String revStr = "";
		for(int i=0; i<str.length(); i+=2){
			if((i+1)<str.length()-1)
				revStr += str.charAt(i+1);
			revStr += str.charAt(i);
		}
		return revStr;
	}
}

public class Thirteenth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a line");
		String str = scan.nextLine();
		String revLine = ThirteenthUserMainCode.swapPairs(str);
		System.out.println("Reverse of the string is:");
		System.out.println(revLine);
		scan.close();
	}
}
