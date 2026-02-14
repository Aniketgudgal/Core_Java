/*
Count Words in PascalCase
Given a PascalCase string, count the number of words in it.
Example
Input: "SaveChangesInTheEditor"
Output: 5
*/
import java.util.Scanner;
public class CountWordPascalCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String input = sc.nextLine();
		int result = countPascalCase(input);
		System.out.println("The total words are: "+result);
	}
	public static int countPascalCase(String s)
	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
				count++;
		}
		return count;
	}
}