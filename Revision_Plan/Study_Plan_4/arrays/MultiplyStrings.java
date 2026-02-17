/*
Multiply Strings
Multiply two non-negative numbers represented as strings without converting to integers.
Example
Input: "123", "456" → "56088"
*/
import java.util.Scanner;
public class MultiplyStrings
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first string number: ");
		String ip1 = sc.next();
		System.out.print("Enter the second string number: ");
		String ip2 = sc.next();
		int num1 = Integer.parseInt(ip1);
		int num2 = Integer.valueOf(ip2);
		System.out.println("The result is: "+num1*num2);
	}
}