import java.util.Scanner;

class Product {
	private int id;
	String productName, supplierName;
	
	public Product() {
		super();
		this.id = 0;
		this.productName = "Default";
		this.supplierName = "Default";
	}

	public Product(int id, String productName, String supplierName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	public Product(int id, String productName) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = "Nivas";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	
	public void display(){
		System.out.println("Product Details:");
		System.out.println("ID    		:" + this.id);
		System.out.println("Product Name	:" + this.productName);
		System.out.println("Supplier Name   :" + this.supplierName);
	}
}

public class TwentySix{
	public static void main(String[] args) {
		Product prod;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the product ID:");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the product name:");
		String productName = scan.nextLine();
		System.out.println("Is the product supplied by Nivas Suppliers? Type “yes” or “no” (not case sensitive)");
		String supplierChoice = scan.nextLine();
		if(supplierChoice.equalsIgnoreCase("Yes"))
			prod = new Product(id,  productName);
		else{
			System.out.println("Enter the supplier name");
			String supplierName = scan.nextLine();
			prod = new Product(id, productName, supplierName);
		}
		prod.display();
		scan.close();
	}
}
