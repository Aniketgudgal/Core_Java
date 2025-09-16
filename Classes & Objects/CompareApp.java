/*
3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
import java.util.Scanner;
public class CompareApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first number: ");
		int first = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int second = sc.nextInt();
		
		NumberComparison n = new NumberComparison();
		n.toComapare(first, second);
	}
}

class NumberComparison
{
	void toComapare(int n1 , int n2)
	{
		if(n1 == n2)
		{
			System.out.printf("The number is equal");
		}
		else if(n1 > n2)
		{
			System.out.printf("The first number is Greater and second is less");
		}
		else
		{
			System.out.printf("The second number is Greater and second is less");
		}
	}
}