/*
Q2. Write a Java program to find all substrings.
Description: Print all substrings.
Input: Enter string: ABC
Output:
A
AB
ABC
B
BC
C
*/
import java.util.Scanner;
public class Substring
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String ip = sc.next();
		int i = 0;
		int j = 0;
		while(i < ip.length() || j < ip.length())
		{
			for(int k = i; k < j; k++)
			{
				System.out.print(ip.charAt(k));
			}
			System.out.println();
			if(j == ip.length())
			{
				i++;
			}
			else
			{
				j++;
			}
		}
	}
}