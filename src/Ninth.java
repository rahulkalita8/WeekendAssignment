import java.util.Scanner;

class NinthUserMainCode {
	
	static int countVowels(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                ++count;
        }
        return count;
	}
	
	public static String storeMaxVowelWord(String str) {
		String[] list = str.split(" ");
		String ans="";
		int max = 0;
		for(String s: list) {
			if(countVowels(s) > max) {
				max = countVowels(s);
				ans = s;
			}
		}
		return ans;
	}
}


public class Ninth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str = scan.nextLine();
		System.out.println(NinthUserMainCode.storeMaxVowelWord(str.toLowerCase()));
		scan.close();
	}
}
