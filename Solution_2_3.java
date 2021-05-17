package Assignment_Solutions;
class Circle{
	private double radius = 1.0;
	private String color = "red";
	
	public Circle() {
		this.radius = radius;
		this.color = color;
		System.out.println("Constructed Circle as a Circle()");
	}
	public Circle(double radius) {
		this.radius = radius;
		this.color = color;
		System.out.println("Constructed Circle as a Circle(radius)");
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		System.out.println("Constructed Circle as a Circle(radius, color)");
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	public void setRadius(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle [Radius is "+radius+ ", Color is " +color+ "]";
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder() {
		super();
		this.height = 1.0;
		System.out.println("Constructed Cylinder as a Cylinder()");
	}
	
	public Cylinder(double height) {
		super();
		this.height = height;
		System.out.println("Constructed Cylinder as a Cylinder(height)");
	}
	public Cylinder(double height, double radius) {
		super(radius);
		this.height = height;
		System.out.println("Constructed Cylinder as a Cylinder(height, radius)");
	}
	
	public Cylinder(double height, double radius, String color) {
		super(radius,color);
		this.height = height;
		System.out.println("Constructed Cylinder as a Cylinder(height, radius,color)");
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}
	
	public String toString() {
		return "This is a Cylinder";
	}

}
public class Solution_2_3 {
	public static void main(String[] args) {
		Cylinder cy1 = new Cylinder();
		System.out.println("Radius is "+cy1.getRadius()+ ", Height is " +cy1.getHeight()+ 
				", Color is " +cy1.getColor()+ ", Area is " +cy1.getArea()+ ", Volume is " +cy1.getVolume());
		
		Cylinder cy2 = new Cylinder(4.0 , 3.0);
		System.out.println("Radius is "+cy2.getRadius()+ ", Height is " +cy2.getHeight()+ 
				", Color is " +cy2.getColor()+ ", Area is " +cy2.getArea()+ ", Volume is " +cy2.getVolume());
	}
}
