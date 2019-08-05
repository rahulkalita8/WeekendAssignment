import java.util.HashMap;
import java.util.Scanner;

class FifthUserMainCode {
	public static Integer getAverageOfOdd(HashMap<Integer, Integer> map){
		Integer sum = 0;
		Integer oddcount=0;
		for(Integer key : map.keySet()){
			if(key%2!=0){
				sum=sum+map.get(key);
				oddcount++;
			}
		}
		if(oddcount==0)
			return 0;
		return (sum/oddcount);
	}
}

public class Fifth {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Hashmap size");
		int hsize = scan.nextInt();
		HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();
		System.out.println("Enter key value pair");
		int k,v;
		for(int i=0;i<hsize;i++){
			k=scan.nextInt();v=scan.nextInt();
			hmap.put(k,v);
		}
		scan.nextLine();
		System.out.println("Average is:" +FifthUserMainCode.getAverageOfOdd(hmap));
		scan.close();
	}
}