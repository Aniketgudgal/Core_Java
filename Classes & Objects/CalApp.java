/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/
import java.util.Scanner;
public class CalApp
{
	public static void main(String x[])
	{
		Calculator c1 = new Calculator();
		c1.add();
		c1.subtract();
		c1.multiply();
		c1.divide();
	}
}
class Calculator
{
	void add()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter the first number: ");
		int n1 = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int n2 = sc.nextInt();
		
		System.out.printf("\nThe addition of two number is: %d",(n1 + n2));
	}
	
	void subtract()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter the first number: ");
		int n1 = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int n2 = sc.nextInt();
		
		System.out.printf("\nThe addition of two number is: %d",(n1 - n2));
	}
	
	void multiply()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter the first number: ");
		int n1 = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int n2 = sc.nextInt();
		
		System.out.printf("\nThe addition of two number is: %d",(n1 * n2));
	}
	
	void divide()
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("\nEnter the first number: ");
		int n1 = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.printf("The addition of two number is: %d",(n1 / n2));
	}
	
}