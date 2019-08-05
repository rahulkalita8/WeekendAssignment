
import java.util.Scanner;
import java.util.Arrays;

class SixthUserMainCode {
	
	static int getAnagram(String a, String b) {
		char[] tempA = a.toCharArray();
		char[] tempB = b.toCharArray();
		Arrays.sort(tempA);
		Arrays.sort(tempB);
		a = new String(tempA);
		b = new String(tempB);
		if(a.equals(b))
			return 1;
		return -1;
	}
}


public class Sixth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		
		if(SixthUserMainCode.getAnagram(a, b) == 1)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
		scan.close();
	}
}
