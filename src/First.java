
import java.util.Scanner;

class FirstUserMainCode {
	public static String replacePlus(String firstWord, String secondWord){
		
		int charMap[] = new int[26];
		String answer=firstWord;

		firstWord = firstWord.toLowerCase();
		secondWord = secondWord.toLowerCase();
		for(int i=0;i<secondWord.length();i++){
			charMap[(int)secondWord.charAt(i)-'a']++;
		}
		
		for(int i=0;i<firstWord.length();i++){
			if(!(charMap[(int)firstWord.charAt(i)-'a']>0))
				answer = answer.replace(answer.charAt(i), '+');
		}
		return answer;
	}
}
public class First{
	public static void main(String [] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String firstWord = scan.nextLine();
		System.out.println("Enter the second string: ");
		String secondWord = scan.nextLine();
		System.out.println("The resultant string is: " + FirstUserMainCode.replacePlus(firstWord, secondWord));
		scan.close();
	}
}
