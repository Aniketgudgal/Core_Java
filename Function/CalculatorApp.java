/*
Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.
*/
import java.util.Scanner;
public class CalculatorApp
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.printf("Welcome to functional Calculator App\n");
		System.out.printf("Enter the choice\n1.Addition \n2.Subtraction \n3.Multiplication \n4.Division\n");
		int choice = xyz.nextInt();
		System.out.printf("Enter the first number: ");
		int firstNumber = xyz.nextInt();
		System.out.printf("Enter the second number: ");
		int secondNumber = xyz.nextInt();
		// user can choice any case
		switch(choice)
		{
			case 1:
				Addition(firstNumber,secondNumber);
				break;
			case 2:
				Subtraction(firstNumber,secondNumber);
				break;
			case 3:
				Multiplication(firstNumber,secondNumber);
				break;
			case 4:
				Division(firstNumber,secondNumber);
				break;
			default:
				System.out.printf("Enter the valid input");
		}
	}
	// functional of each operation
	public static void Addition(int n1, int n2)
	{
		System.out.printf("The Subtraction of two Number is: %d",(n1 + n2));
	}
	public static void Subtraction(int n1, int n2)
	{
		System.out.printf("The Subtraction of two Number is: %d",(n1 - n2));
	}
	public static void Multiplication(int n1, int n2)
	{
		System.out.printf("The Multiplication of two Number is: %d",(n1 * n2));
	}
	public static void Division(int n1, int n2)
	{
		System.out.printf("The Division of two Number is: %d",(n1 / n2));
	}
}