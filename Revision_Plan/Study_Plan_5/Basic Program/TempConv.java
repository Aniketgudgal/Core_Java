/*
Write a Java program to convert temperature from Celsius to Fahrenheit.
Input:
Celsius = 37

Output:
Fahrenheit = 98.6

Explanation:
The formula used is:
F = (C × 9 / 5) + 32
The Celsius value is converted into Fahrenheit using this formula.
*/
import java.util.Scanner;
public class TempConv
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature in Celsius: ");
		float col = sc.nextFloat();
		float fTemp = (col*9/5)+32;
		System.out.println("The Temperature in Fahrenheit is: "+fTemp);
	}
}