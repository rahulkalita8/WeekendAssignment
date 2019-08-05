import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Author {
	
	private String name;
	private String email;
	private String gender;
	
	public Author(String name, String email, String gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName();
	}
}


class Book {
	private String name;
	private List<Author> authorList;
	private double price;
	private int qtyInStock = 0;
	
	public Book() {
		
	}
	public Book(String name, List<Author> authorList, double price) {
		this.name = name;
		this.authorList = authorList;
		this.price = price;
	}
	public Book(String name, List<Author> authorList, double price, int qtyInStock) {
		this.name = name;
		this.authorList = authorList;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Author> getAuthorList() {
		return authorList;
	}
	public void setAuthorList(List<Author> authorList) {
		this.authorList = authorList;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		String names = "";
		for(Author author: authorList) {
			names += author.getName() + " ";
		}
		return name + " authored by " + names + "costs Rs." + price + ":" + (qtyInStock > 0 ? "Available" : "Not Available");
	}
}


public class TwentySeven {
	public static void main(String[] args) {
		String name;
		String isAvailable;
		String author;
		String email;
		String gender;
		int authorCount;
		int qtyInStock;
		double price;
		List<Author> authorList = new ArrayList<>();
		Book book;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the book name");
		name = scan.nextLine();
		System.out.println("Enter the number of authors");
		authorCount = scan.nextInt();
		for(int i=0; i<authorCount; i++) {
			System.out.println("Enter the author name");
			author = scan.next();
			System.out.println("Enter the author email id");
			email = scan.next();
			System.out.println("Enter the author's gender");
			gender = scan.next();
			authorList.add(new Author(author, email, gender));
		}
		System.out.println("Enter the book price");
		price = scan.nextDouble();
		System.out.println("Is the book currently available? Type “Yes/No” (Not case sensitive)");
		isAvailable = scan.next();
		if(isAvailable.toLowerCase().equalsIgnoreCase("yes")) {
			System.out.println("Enter the number of books available");
			qtyInStock = scan.nextInt();
			book = new Book(name, authorList, price, qtyInStock);
		} else {
			book = new Book(name, authorList, price);
		}
		System.out.println(book);
		scan.close();
	}
}

