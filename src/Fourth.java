

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class FourthUserMainCode {
	public static ArrayList<Integer> generateOddEvenList (ArrayList<Integer> first, 
			ArrayList <Integer> second){
		ArrayList <Integer> result = new ArrayList<Integer>();
		for(int i=0;i<first.size();i++){
			if(i%2!=0){
				result.add(first.get(i));
			}
			else{
				result.add(second.get(i));
			}
		}
		return result;
	}
}

public class Fourth {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of the araylist :");
		int size = scan.nextInt();
		ArrayList<Integer> first = new ArrayList<>(size);
		ArrayList<Integer> second = new ArrayList<>(size);
		int element;
		System.out.println("Enter elements of first arraylist: ");
		for(int i=0;i<size;i++){
			element = scan.nextInt();
			first.add(element);
			
		}
		System.out.println("Enter elements of second arraylist: ");
		for(int i=0;i<size;i++){
			element = scan.nextInt();
			second.add(element);
		}	
		scan.nextLine();
		System.out.println("Result arraylist is: " + Arrays.toString(
				FourthUserMainCode.generateOddEvenList(first, second).toArray()));
		scan.close();
	}
}