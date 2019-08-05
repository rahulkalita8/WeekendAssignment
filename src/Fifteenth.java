import java.util.*;
import java.time.LocalDate;
import java.time.Period;

class FifteenthUserMainCode {
  
	public static TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String> mapOne,HashMap<Integer,Integer> mapTwo ){
	TreeMap<Integer,Integer> treeMapEmployee=new TreeMap<Integer,Integer>(); 
	
	for(Map.Entry<Integer, String> it:mapOne.entrySet()){
		int id=it.getKey();
		String dob=it.getValue();
		int salary=mapTwo.get(id);
		int age=getAge(dob);
		int bonus=-1;
		if(salary<5000) bonus=-100;
		else if(age<25 || age>60) bonus=-200;
		else if(age>=25 && age<=30) bonus = (2*salary)/10;
		else bonus = (3*salary)/10;
		treeMapEmployee.put(id, bonus);
		
	}
	return treeMapEmployee;
   }
   
   public static int getAge(String dob){
	   String[] arr=dob.split("-");
	   int date=Integer.parseInt(arr[0]);
	   int month = Integer.parseInt(arr[1]);
	   int year=Integer.parseInt(arr[2]);
	   
	   LocalDate l = LocalDate.of(year,month,date); 
	   LocalDate now = LocalDate.of(2014, 9 ,01); 
	   Period diff = Period.between(l, now);
	   
	   return diff.getYears();
   }
}

public class Fifteenth {
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of employee");
		int size = scan.nextInt();
	
		HashMap<Integer,String> mapOne = new HashMap<Integer,String>();
		HashMap<Integer,Integer> mapTwo=new HashMap<Integer,Integer>();
		
		TreeMap<Integer,Integer> treeMapEmployee;
		for(int i=0;i<size;i++){
			System.out.println("Enter ID, DOB and salary of Employee " + (i+1));
			int id=scan.nextInt();
			
			String dob=scan.next();
			
			int salary = scan.nextInt();
			
			mapOne.put(id, dob);
			mapTwo.put(id,salary);
			
			
		}
		treeMapEmployee=FifteenthUserMainCode.calculateRevisedSalary(mapOne, mapTwo);
		System.out.println("The revised salary are: ");
		for(Map.Entry<Integer, Integer> it:treeMapEmployee.entrySet()){
			System.out.println("For Employee " + it.getKey() + ":" + (it.getValue()+mapTwo.get(it.getKey())));
		}
		scan.close();
	}
}

