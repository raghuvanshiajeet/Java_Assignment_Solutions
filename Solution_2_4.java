package Assignment_Solutions;

class Shape{
	private String color;
	public Shape(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Shape [Color = " +color+ "]";
	}
	
	public double getArea() {
		System.err.println("Shape unknown cannot compute area !!!");
		return 0;
	}
}

class Rectangle extends Shape{
	private int length, width;
	
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public String toString() {
		return "Rectangle [length = "+length+ ", width = " +width+ " , " +super.toString() +"]";
	}
	
	public double getArea() {
		return length*width;
	}
}

class Triangle extends Shape{
	private int base, height;
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	
	public String toString() {
		return "Triangle [base = "+base+ ", height = " +height+ " , " +super.toString() +"]";
	}
	
	public double getArea() {
		return 0.5*base*height;
	}
}

public class Solution_2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Shape s1 = new Rectangle("Red", 4, 5);
		 System.out.println(s1);
		 System.out.println("Area is " +s1.getArea());
		 
		 Shape s2 = new Triangle("Blue", 4, 5);
		 System.out.println(s2);
		 System.out.println("Area is " +s2.getArea());
		 
		 Shape s3 = new Shape("Green");
		 System.out.println(s3);
		 System.out.println("Area is " +s3.getArea());
	}

}
