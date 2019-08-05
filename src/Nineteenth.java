import java.util.Scanner;
import java.util.StringTokenizer;

class NineteenthUserMainCode{
	public static String  getLastLetter (String str) {
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder ans = new StringBuilder("");
		String temp;
		while(st.hasMoreTokens()) {
			temp=st.nextToken();
			if((ans+"").equals("")) ans.append(temp.charAt(temp.length()-1));
			else ans.append("$"+temp.charAt(temp.length()-1));
		}
		return (ans+"").toUpperCase();

	}
	
}
public class Nineteenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = scan.nextLine(); 
		System.out.println(NineteenthUserMainCode.getLastLetter(sentence));
		scan.close();
	}

}
