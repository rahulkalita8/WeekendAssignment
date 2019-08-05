

import java.util.Scanner;

class ThirdUserMainCode {
	public static int countNoOfWords(String strOne, String strTwo){
		String strOneSplit[] = strOne.split(" ");
		String strTwoSplit[] =strTwo.split(" ");
		int count = 0;
		for(int i=0;i<strOneSplit.length;i++){
			if(strOneSplit[i].equals(strTwoSplit[1])){
				count++;
			}
		}
		return count;
	}
}

public class Third {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String wordOne = scan.nextLine();
		System.out.println("Enter the second string: ");
		String wordTwo = scan.nextLine();
		System.out.println("Answer is: " + ThirdUserMainCode.countNoOfWords(wordOne, wordTwo));
		scan.close();
	}
}

