package abstration;
abstract class Shape
{
	abstract double calculateArea();
}
class Circle extends Shape{
	private double radius;

	Circle(double radius)
	{
		this.radius = radius;
	}
	double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius ;
	}
	
}
class Rectangle extends Shape{
	private double length;
	private double width;
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}
public class Abstration1 {
	public static void main(String[] args) {
		Shape circle = new Circle(10);
		Shape rectangle  = new Rectangle(12,10);
		System.out.println(circle.calculateArea());
		System.out.println(rectangle.calculateArea());
	}
}
