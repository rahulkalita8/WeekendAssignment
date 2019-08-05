import java.util.ArrayList;
import java.util.Scanner;

class UserMainCode{
	
	static ArrayList<Integer> performSetOperations(ArrayList<Integer> first, ArrayList<Integer> second, char operator){
		ArrayList<Integer> result = new ArrayList<>();
		
		if(operator == '+'){
			result = first;
			result.addAll(second);
		}
		if(operator == '*'){
			result = first;
			result.retainAll(second);
		}
		if(operator == '-'){
			result = first;
			ArrayList<Integer> temp = new ArrayList<>(first);
			temp.retainAll(second);
			result.removeAll(temp);
		}
		
		return result;
	}
	
}

public class Tenth {

	public static void main(String[] args) {
		int size;
		ArrayList<Integer> first = new ArrayList<>();
		ArrayList<Integer> second = new ArrayList<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the ArrayList");
		size = scan.nextInt();
		System.out.println("Enter first arraylist elements");
		for(int i=0; i<size; i++){
			int element = scan.nextInt();
			first.add(element);
		}
		System.out.println("Enter second arraylist elements");
		for(int i=0; i<size; i++){
			int element = scan.nextInt();
			second.add(element);
		}	
		System.out.println("Enter operator\n"
				+ "+ for UNION\n"
				+ "- for DIFFERENCE\n"
				+ "* for INTERsSECTION");
		char operator = scan.next().charAt(0);
		result = UserMainCode.performSetOperations(first, second, operator);
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
		scan.close();
	}
	
}
