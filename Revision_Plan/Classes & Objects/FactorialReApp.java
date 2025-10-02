/*
Q2. Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.
*/
import java.util.Scanner;
class FactorialRe
{
	int x;
	public void setValue(int x)
	{
		this.x = x;
	}
	public int getFactorial()
	{
		int result = 1; 
		while(x != 0)
		{
			result = result*x;
			x--;
		}
		return result;
	}
}
public class FactorialReApp
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		FactorialRe f = new FactorialRe();
		f.setValue(n);
		int result = f.getFactorial();
		System.out.println("The factorial "+n+" is: "+result);
	}
}