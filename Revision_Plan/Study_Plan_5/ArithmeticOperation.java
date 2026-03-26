/*
Write a Java program to enter two numbers and perform addition, subtraction, multiplication, division, and modulus.
Input:
Number1 = 20
Number2 = 5

Output:
Addition = 25
Subtraction = 15
Multiplication = 100
Division = 4
Modulus = 0

Explanation:
The program performs all basic arithmetic operations using the two given numbers and displays the results.
*/
public class ArithmeticOperation
{
	public static void main(String x[])
	{
		Integer a = Integer.parseInt(x[0]);
		Integer b = Integer.parseInt(x[1]);
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		System.out.println("Multiplication is: "+a*b);
		System.out.println("Division is: "+(a/b));
		System.out.println("Modulus is: "+(a%b));
	}
}