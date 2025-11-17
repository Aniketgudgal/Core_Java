/*
Q1. Write a program to crate class name as Value with single function name as setValue(int,int) and we have to create three child classes name as Add with function int getAdd() , Mul with function getMul() and Div with function getDiv() and getAdd() function return addition of two value which is inherited from Value class , getMul() function return multiplication of two values which is inherited from Value class and gitDiv() function return division of two values which Is inherited from Value class.
*/
import java.util.Scanner;
class Value
{
	int a;
	int b;
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
}
class Add extends Value
{
	int getAdd()
	{
		return a+b;
	}
}
class Div extends Value
{
	int getDiv()
	{
		return a/b;
	}
}
class Mul extends Value
{
	int getMul()
	{
		return a*b;
	}
}
public class CalApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Value: ");
		int a = sc.nextInt();
		System.out.print("Enter the second Value: ");
		int b = sc.nextInt();
		
		Add ad = new Add();
		ad.setValue(a,b);
		int result = ad.getAdd();
		System.out.println("The Addition is: "+result);
		
		Mul m = new Mul();
		m.setValue(a,b);
		result = m.getMul();
		System.out.println("The Multiplication is: "+result);
		
		Div d = new Div();
		d.setValue(a,b);
		result = d.getDiv();
		System.out.println("The Division is: "+result);
	}
}