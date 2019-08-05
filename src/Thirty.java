import java.util.Scanner;
import java.util.*;

class Box {
  
  double length;
  double width;
  double height;
  double volume;  
  
  public Box(double length, double width, double height) {
	this.length = length;
	this.width = width;
	this.height = height;
	this.volume = length * width * height;
  }

@Override
public int hashCode() {
		return 1;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Box other = (Box) obj;
	if(this.volume != other.volume) 
		return false;
	return true;
}
 

  
}


public class Thirty {
	public static void main(String[] args){
		
		Scanner scan=new Scanner(System.in);
		
		Set<Box> set=new HashSet<Box>();
		
		System.out.println("Enter the number of Box");
		
		int bcount = scan.nextInt();
		
		for(int i=0;i<bcount;i++){
			System.out.println(" Enter the Box " + (i+1) + " Detail : ");
			System.out.println("Enter Length");
			Double length=scan.nextDouble();
			System.out.println("Enter Width");
			Double width=scan.nextDouble();
			System.out.println("Enter Height");
			Double height = scan.nextDouble();
			
          Box box = new Box(length,width,height);
          set.add(box);
			
		}
		
		System.out.println("Unique Boxes in the Set are");
		for(Box box:set){
			System.out.println("Length = " +box.length+ " Width = " +box.width+" Height = " +box.height +" Volume = " + box.volume );
			
		}
		scan.close();
		
	}
	
}
