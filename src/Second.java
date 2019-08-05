import java.util.Scanner;
import java.util.Arrays;  

class SecondUserMainCode {
	
	public static int  addUniqueEven(int[] arr){
		Arrays.sort(arr);
        int sum=0;
        
        int j = 0;//for next element  
        for (int i=0; i<arr.length-1; i++){  
            if (arr[i] != arr[i+1]){  
                arr[j++] = arr[i];  
            }  
        }  
        arr[j++] = arr[arr.length-1];  
        for(int i=0;i<j;i++)
        {
            if(arr[i]%2==0)
            {
                sum=sum+arr[i];
            }
        }
        return sum;
	}
}

public class Second {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = scan.nextInt();
		System.out.println("Enter the array:");
		int array[]=new int[n];
		for(int i=0;i<n;i++){
			array[i]=scan.nextInt();
		}
		scan.nextLine();
		int result=SecondUserMainCode.addUniqueEven(array);
		if (result==0){
			System.out.println("No Even Numbers");
		}
		else{
			System.out.println(result);
		}
		scan.close();
	}
}

