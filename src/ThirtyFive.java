
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class CardCollector {

	Map< String , List<Integer> > cardMap;
	
	public CardCollector() {
		cardMap=new HashMap<String,List<Integer>>();
	}
	
	public void insertCard(String symbol,int value) {
		if(!cardMap.containsKey(symbol)) {
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(value);
			cardMap.put(symbol, l1);
		}else
		cardMap.get(symbol).add(value);
	}
	
	public void displayCardDetails() {
		 ArrayList<String> sortedKeys = 
                 new ArrayList<String>(cardMap.keySet());       
		 Collections.sort(sortedKeys);
		System.out.println("Distinct Symbols are :");
		for(String sym:sortedKeys)
			System.out.printf(" %s ",sym);
		System.out.println();
		for(String sym:sortedKeys) {
			System.out.printf("Cards in %s are :\n",sym);
			List<Integer> temp=cardMap.get(sym);
			int sumval=0;
			for(int val:temp) {
				System.out.printf("%s %d \n",sym,val);
				sumval+=val;
			}
			System.out.printf("Number of cards :%d\n",temp.size());
			System.out.printf("Sum of Numbers :%d\n",sumval);

		}
		
	}
}


public class ThirtyFive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CardCollector cardCollector = new CardCollector();
		System.out.println("Enter Number of Cards :");
		int numCards=sc.nextInt();
		for(int i=1;i<=numCards;i++) {
			System.out.printf("Enter card %d:\n",i);
			String sym=sc.next();
			int val=sc.nextInt();
			cardCollector.insertCard(sym, val);
		}
		cardCollector.displayCardDetails();
		sc.close();
	}

}
