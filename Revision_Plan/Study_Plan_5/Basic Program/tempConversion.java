/*
Write a Java program to convert temperature from Fahrenheit to Celsius.
Input:
Fahrenheit = 98

Output:
Celsius = 36.67

Explanation:
The formula used is:
C = (F ? 32) × 5 / 9
Applying the formula gives the Celsius temperature.
*/
import java.util.Scanner;
public class tempConversion
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature in Fahrenheit: ");
		float temp = sc.nextInt();
		float cel = (temp-32)*5/9;
		System.out.println("The Temperature in Celsius is: "+cel);
	}
}