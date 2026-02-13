/*
2)	Valid Parentheses(leetcode-20)
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
A string is valid if:
•	Open brackets are closed by the same type.
•	Open brackets are closed in the correct order.
Example
Input: "()[]{}" → true
Input: "(]" → false
*/
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input: ");
		String input = sc.next();
		Stack<Character> sl = new Stack<Character>();
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == '{' || input.charAt(i) == '(' || input.charAt(i) == '[')
			{
				sl.push(input.charAt(i));
			}
			else
			{
				if(!sl.isEmpty())
				{
					if((input.charAt(i) == ')' && sl.peek() == '(' ) ||(sl.peek() == '{' && input.charAt(i) == '}') || (input.charAt(i) == ']' && sl.peek() == '['))
					{
						sl.pop();
					}
					else
					{
						System.out.println("This is not valid parentheses");
						break;
					}
				}
				else
				{
					System.out.println("This is not valid");
					break;
				}
			}
		}
		if(sl.isEmpty())
		{
			System.out.println("The give parentheses is valid input");
		}
		else
		{
			System.out.println("This is not valid parentheses");
		}
	}
}