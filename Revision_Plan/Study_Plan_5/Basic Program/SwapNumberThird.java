/*
 Write a Java program to swap two numbers without using a third variable.
Input:
A = 4
B = 7

Output:
A = 7
B = 4

Explanation:
Swapping is done using arithmetic operations such as addition and subtraction without using an extra variable.
*/
import java.util.Scanner;
public class SwapNumberThird
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
	}
}