/*
Q15. Write a program to count digits in a string.
 Input : abc123
 Output : 3
*/
import java.util.Scanner;
public class CountDigitsInString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String in = sc.nextLine();
		int result = countDigits(in);
		System.out.println("Total Character in string "+in+" is: "+result);
	}
	public static int countDigits(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 48&& s.charAt(i) <= 57)
			{
				count++;
			}
		}
		return count;
	}
}