import java.util.Scanner;

class IntegerWrapper {

	public static int binStringToInt(String num) {
		return Integer.parseInt(num, 2);
	}
	public static int octStringToInt(String num) {
		return Integer.parseInt(num, 8);
	}
	public static int hexStringToInt(String num) {
		return Integer.parseInt(num, 16);
	}
}


public class ThirtyThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String binaryNum,octNum,hexNum;
		System.out.println("Enter the binary number");
		binaryNum=sc.next();
		System.out.println("Enter the octal number");
		octNum=sc.next();
		System.out.println("Enter the hexadecimal number");
		hexNum=sc.next();
		System.out.printf("The integer value of the binary number %s is %d \n",binaryNum,IntegerWrapper.binStringToInt(binaryNum));
		System.out.printf("The integer value of the octal number %s is %d \n",octNum,IntegerWrapper.octStringToInt(octNum));
		System.out.printf("The integer value of the hexadecimal number %s is %d",hexNum,IntegerWrapper.hexStringToInt(hexNum));	
		
		sc.close();
	}
}
