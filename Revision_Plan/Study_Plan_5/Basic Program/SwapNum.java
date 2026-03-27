/*
Write a Java program to swap two numbers using a third variable.
Input:
A = 5
B = 10

Output:
A = 10
B = 5

Explanation:
A temporary variable is used to store one value while swapping the numbers.
*/
import java.util.Scanner;
public class SwapNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}