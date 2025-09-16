/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/
import java.util.Scanner;
public class EvenOddApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the Number: ");
		int number = sc.nextInt();
		NumberChecker n = new NumberChecker();
		n.isEven(number);
	}
}
class NumberChecker 
{
	void isEven(int n)
	{
		if(n % 2 == 0)
		{
			System.out.printf("The number is Even");
		}
		else
		{
			System.out.printf("The number is Odd");
		}
	}
}