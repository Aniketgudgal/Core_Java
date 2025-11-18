/*
Q6.Write a program to create a base class Shape with method setDimensions(int,int).
Create three child classes:

Rectangle → method getArea() → returns area

Triangle → method getArea() → returns (base * height) / 2

Square → method getArea() → returns side * side (only one value needed)
*/
import java.util.Scanner;
class Shape
{
	int base, height;
	int side;
	void setDimensions(int base, int height)
	{
		this.base = base;
		this.height = height;
	}
	void setDimensions(int side)
	{
		this.side = side;
	}
	int getArea()
	{
		return 0;
	}
}
class Rectangle extends Shape
{
	int getArea()
	{
		return (base*height);
	}
}
class Triangle extends Shape
{
	int getArea()
	{
		return (base * height)/2;
	}
}
class Square extends Shape
{
	int getArea()
	{
		return side*side;
	}
}
public class ShapeApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Rectangle");
		System.out.print("Enter the base: ");
		int base = sc.nextInt();
		System.out.print("Enter the height: ");
		int height = sc.nextInt();
		
		Rectangle r = new Rectangle();
		r.setDimensions(base,height);
		int result = r.getArea();
		System.out.println("The Area of Rectangle is: "+result);
		
		System.out.println("Enter the value of Triangle");
		System.out.print("Enter the base: ");
		base = sc.nextInt();
		System.out.print("Enter the height: ");
		height = sc.nextInt();
		Triangle t = new Triangle();
		t.setDimensions(base,height);
		result = t.getArea();
		System.out.println("The Area of Triangle is: "+result);
		
		System.out.println("Enter the value of Square");
		System.out.print("Enter the side: ");
		int side = sc.nextInt();
		Square s = new Square();
		s.setDimensions(side);
		result = s.getArea();
		System.out.println("The Area of Square is: "+result);
	}
}