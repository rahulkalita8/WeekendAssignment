import java.util.Scanner;

class SeventeenthUserMainCode{
	public static int findMaxDistance (int[] arr) {
		int maxIndex=0;
		int maxDiff=Integer.MIN_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if(Math.abs(arr[i]-arr[i+1]) > maxDiff ) {
				if(arr[i]>arr[i+1]) 
					maxIndex=i;
			}		
		}
		return maxIndex;
	}
	
}
public class Seventeenth {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=scan.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array: ");
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(SeventeenthUserMainCode.findMaxDistance(arr));
		scan.close();
	}

}
