/*
Reverse Words in a Sentence
Given a string s, reverse the order of words.
Example
Input: "I love coding"
Output: "coding love I"
*/
import java.util.Scanner;
public class ReverseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String input = sc.nextLine() + " ";
		String result = "";
		for(int i = input.length() - 1; i>= 0; i--)
		{
			if(input.charAt(i) != ' ')
			{
				result += input.charAt(i);
			}
			else
			{
				result += " ";
			}
		}
		input = "";
		result += " ";
		String finalString = "";
		for(int i= 0; i < result.length(); i++)
		{
			if(result.charAt(i) == ' ')
			{
				
				finalString += reverseWord(input)+" ";
				input = "";
			}
			else
			{
				input += result.charAt(i);
			}
		}
		System.out.println("result is:"+finalString);
		
	}
	public static String reverseWord(String s)
	{
		String result = "";
		for(int i = s.length() - 1; i>= 0; i--)
		{
			result += s.charAt(i);
		}
		return result;
	}
}