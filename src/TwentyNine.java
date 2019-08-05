
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Card {
	private String symbol;
	private int number;
	
	public Card(String symbol, int number) {
		this.symbol = symbol;
		this.number = number;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return symbol + "\n" + number;
	}
}


public class TwentyNine {
	public static void main(String[] args) {
		String symbol;
		int number;
		int count=0;
		Set<Card> set = new HashSet<>();
		Scanner scan = new Scanner(System.in);
		while(set.size() != 4) {
			System.out.println("Enter a card :");
			symbol = scan.next();
			number = scan.nextInt();
			set.add(new Card(symbol, number));
			count++;
		}
		System.out.format("Four symbols gathered in %d cards.\nCards in Set are :\n", count);
		set.forEach(action -> System.out.println(action));
		scan.close();
	}
}
