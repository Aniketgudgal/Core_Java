/*
Q8. Check whether expression has balanced parentheses.
Input:
{[()]}
Output:
Balanced
*/
import java.util.Scanner;
import java.util.Stack;
public class ExpressionParentheses
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the expression: ");
		String input = sc.next();
		boolean result = checkExpreesion(input);
		if(result)
		{
			System.out.println("The expression is valid");
		}
		else
		{
			System.out.println("not valid expression");
		}
	}
	public static boolean checkExpreesion(String input)
	{
		Stack<Character> ch = new Stack<>();
		for(int i = 0; i < input.length(); i++)
		{
			if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')
			{
				ch.push(input.charAt(i));
			}
			else if(!ch.empty())
			{
				if((ch.peek() == '(' && input.charAt(i) == ')') || (ch.peek() == '[' && input.charAt(i) == ']') || (ch.peek() == '{' && input.charAt(i) == '}'))
				{
					ch.pop();
				}
				else
				{
					System.out.println("not balanced");
					return false;
				}
			}
			else
			{
				System.out.println("not balanced");
				return false;
			}
		}
		if(ch.empty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}