/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/
import java.util.Scanner;
class Factorial
{
	int factorialCalculator(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return n*factorialCalculator(n-1);
	}
}
public class FactorialApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = sc.nextInt();
		Factorial f = new Factorial();
		System.out.printf("factorial is: %d",f.factorialCalculator(num));
	}
}