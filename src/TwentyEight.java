
import java.util.*;
import java.util.Scanner;

class Employee {

	public String firstName;
	public String lastName;
	public long mobileNumber;
	public String email;
	public String address;

	
	public Employee(String firstName, String lastName, long mobileNumber, String email, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.address = address;
	}
}


public class TwentyEight {
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		ArrayList<Employee> arr=new ArrayList<Employee>();
		
		System.out.println("Enter the number of Employees");
		
		int ecount = scan.nextInt();
		
		for(int i=0;i<ecount;i++){
			System.out.println(" Enter Employee " + (i+1) + " Details : ");
			System.out.println("Enter the Firstname");
			String firstName=scan.next();
			System.out.println("Enter the Lastname");
			String lastName=scan.next();
			System.out.println("Enter the Mobile");
			long mobile = scan.nextLong();
			System.out.println("Enter the Email");
			String email = scan.next();
			System.out.println("Enter the Address");
			String address= scan.next();
			
          Employee emp = new Employee(firstName,lastName,mobile,email,address);
          arr.add(emp);
			
		}
		
		Collections.sort(arr,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.firstName.compareTo(o2.firstName);
			}
			
			
		});
		
		
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Mobile","Email","Address");
		
		for(Employee emp: arr ){
		
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.firstName,emp.lastName,emp.mobileNumber,emp.email,emp.address);
		
		}
		scan.close();
	}
	
}
