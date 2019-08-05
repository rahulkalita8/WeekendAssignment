import java.util.Scanner;

class MathFunctions {
	static public int returnAbs(int a){
		return Math.abs(a);
	}
	static public boolean compareNums(int a,int b){
		return a==b;
	}
}

public class ThirtyTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer ");
		int a=sc.nextInt();
		System.out.println("Enter the second integer ");
		int b=sc.nextInt();
		System.out.printf("Absolute value of %d is %d\n",a,MathFunctions.returnAbs(a));
		System.out.printf("Absolute value of %d is %d\n",a,MathFunctions.returnAbs(a));
		if(MathFunctions.compareNums(a, b))
			System.out.printf("%d = %d",a,b);
		else
			System.out.printf("%d != %d",a,b);
		
		sc.close();
	}
}
