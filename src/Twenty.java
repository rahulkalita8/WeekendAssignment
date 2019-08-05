import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class TwentyUserMainCode{
	public static String getMaxKeyValue(HashMap<Integer,String> hashMap) {
		int maxKey=Integer.MIN_VALUE;
		String ans="";
		for(Map.Entry<Integer,String> entry : hashMap.entrySet()) {
			if(entry.getKey()>maxKey ) {
				maxKey=entry.getKey();
				ans=entry.getValue();
			}
		}
		return ans;

	}
	
}
public class Twenty {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the hashmap");
		int n=Integer.parseInt(scan.nextLine());
		HashMap<Integer,String> hashMap =new HashMap<Integer,String>(n);
		System.out.println("Enter hashMap key-value");
		for(int i=0;i<n;i++) {
			hashMap.put(Integer.parseInt(scan.nextLine()),scan.nextLine());
		}
		System.out.println(TwentyUserMainCode.getMaxKeyValue(hashMap));
		scan.close();
	}

}
