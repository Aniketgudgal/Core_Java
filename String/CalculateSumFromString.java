/*
WAP to input string and separate digit from string and calculate its sum?
Example: abc123mno456;
Output:1+2+3+4+5+6 =21
*/
import java.util.Scanner;
public class CalculateSumFromString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of String: ");
		String val = sc.nextLine();
		int sum = 0;
		for(int i = 0; i < val.length(); i++)
		{
			if(val.charAt(i) >= '0' && val.charAt(i) <= '9')
			{
				sum = sum + val.charAt(i) - '0';
			}
		}
		System.out.println("Sum is: "+sum);
	}
}