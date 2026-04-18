/*
Q1. Write a Java program to remove duplicate characters.
Description:Keep only the first occurrence.
Input:Enter string: programming
Output:progamin
*/
import java.util.Scanner;
public class removeDuplicateChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String ip = sc.next();
		int[] num = new int[26];
		for(int i = 0; i < ip.length(); i++)
		{
			int index = ip.charAt(i) - 'a';
			num[index]++;
		}
		for(int i = 0; i < ip.length(); i++)
		{
			int count = num[ip.charAt(i) - 'a'];
			if(count == 1)
			{
				System.out.print(ip.charAt(i));
			}
			else if(count > 1)
			{
				num[ip.charAt(i) - 'a'] = 0;
				System.out.print(ip.charAt(i));
			}
		}
	}
}