/*
Q6. Write a Java program to find the second non-repeating character.
Description: Find the second character appearing once.
Input: Enter string: swiss
Output: Second non repeating character: i
*/
import java.util.Scanner;
public class SecondNonRepeatingChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String input = sc.nextLine();
		int[] ch = new int[26];
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
			{
				ch[(input.charAt(i) + 32) - 'a']++;
			}
			else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
			{
				ch[input.charAt(i) - 'a']++;
			}
		}
		int count = 1;
		char result = ' ';
		for(int i= 0; i <input.length(); i++)
		{
			
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')
			{
				int val = ch[(input.charAt(i) + 32) - 'a'];
				if(count == 2 && val == 1)
				{
					result = input.charAt(i);
					break;
				}
				if(val == 1)
				{
					count++;
				}
			}
			else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'z')
			{
				int val = ch[input.charAt(i) - 'a'];
				if(count == 2 && val == 1)
				{
					result = input.charAt(i);
					break;
				}
				if(val == 1)
				{
					count++;
				}
			}
		}
		if(result != ' ')
		{
			System.out.println("The character is: "+result);
		}
		else
		{
			System.out.println("There is not character present");
		}
	}
}