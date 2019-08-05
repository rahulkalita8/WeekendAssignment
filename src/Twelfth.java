import java.util.Scanner;

class TwelfthUserCodeMain{
	static String getWordWithMaximumVowels(String sentence){
		String maxVowel= "";
		int maxVowelCount = 0;
		
		sentence = sentence.trim();
		String[] words = sentence.split(" ");
		for (String word : words) {
			int count = 0;
			for(int i=0; i<word.length(); i++){
				switch(word.charAt(i)){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count += 1;
					break;
				}
			}
			if(count>maxVowelCount){
				maxVowel = word;
				maxVowelCount = count;
			}
		}
		return maxVowel;
	}
}

public class Twelfth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = scan.nextLine();
		String maxVowelWord = TwelfthUserCodeMain.getWordWithMaximumVowels(sentence);
		System.out.println("Maximum vowel is in the word: " + maxVowelWord);
		scan.close();
	}
}
