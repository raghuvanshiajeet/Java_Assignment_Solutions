package Assignment_Solutions;
class Author{
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name+ " [" +gender+ "] " +email;
	}
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
		}
	public String getName() {
		return name;
	}
	public Author getAuthor() {
		return author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String toString() {
		return name+ " by " +author;
	}
}

public class Solution_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1 = new Author("Ajeet Raghuvanshi","technicalajeet786@gmail.com",'m');
		System.out.println(a1);
		Book b1 = new Book("Java for Beginners",a1 ,99.99,10);
		System.out.println(b1);
		b1.setPrice(100.99);
		b1.setQty(20);
		System.out.println("Name is " +b1.getName());
		System.out.println("Price is "+b1.getPrice());
		System.out.println("Quantity is "+b1.getQty());
		System.out.println("Author is "+b1.getAuthor());
		System.out.println("Author's Name is "+b1.getAuthor().getName());
		System.out.println("Author's Gender is "+b1.getAuthor().getGender());
		System.out.println("Author's Email is "+b1.getAuthor().getEmail());
	}

}
