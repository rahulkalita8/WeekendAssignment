import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class StringList {
	List<String> strList;
	public
	StringList(){
		strList=new ArrayList<String>();  
	}
	void insertInList(String ele){
		strList.add(ele);
	}
	boolean searchInList(String ele){
		return strList.contains(ele);
	}
	boolean deleteInList (String ele){
		return strList.remove(ele);
	}
	void displayList (){
		for(String s:strList){  
			System.out.println(s);  
		}  
	}
}


public class ThirtyFour {
	public static void main(String[] args) {
		StringList stringList = new StringList();
		boolean flag=true;
		int choice;
		Scanner sc=new Scanner(System.in);
		while(flag) {
			System.out.println("1. Insert\r\n" + 
					"2. Search\r\n" + 
					"3. Delete\r\n" + 
					"4. Display\r\n" + 
					"5. Exit\r\n" + 
					"Enter your choice : " + 
					"");
			choice=sc.nextInt();
			String ele;
			switch(choice) {
			case 1:	System.out.println("Enter the item to be inserted: ");
					ele=sc.next();
					stringList.insertInList(ele);
					break;
			case 2: System.out.println("Enter the item to search : ");
					ele=sc.next();
					if(stringList.searchInList(ele))
						System.out.println("Item found in the list");
					else
						System.out.println("Item not found in the list");
					break;
			case 3: System.out.println("Enter the item to delete : ");
					ele=sc.next();
					if(stringList.deleteInList(ele))
						System.out.println("Item deleted from the list");
					else
						System.out.println("Item not found in the list");
					break;
			case 4: stringList.displayList();
					break;
			case 5: flag=false; 
					System.out.println(" Program ended ");
					break;
			default: System.out.println(" wrong option ");
					break;
			}
		}
		
		sc.close();
	}
}
