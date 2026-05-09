/*
WAP to input string and reverse word from a string?
Example: good morning india
Output: doog gninrom aidni
*/
import java.util.Scanner;
public class ReverseEachWordInString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String val = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();
		for(int i = 0; i < val.length(); i++)
		{
			if(val.charAt(i) == ' ' || i == val.length() -1) // check space and last character in string
			{
				if(i == val.length() -1)
				{
					sb.append(val.charAt(i));
				}
				result.append(reverseWord(sb)+" ");
				sb.setLength(0);
			}
			else
			{
				sb.append(val.charAt(i));
			}
		}
		System.out.println(result);
	}
	// reverse the string 
	public static String reverseWord(StringBuffer sb)
	{
		int i = 0;
		int j = sb.length() -1;
		while(i < j)
		{
			char ch = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
		}
		return sb.toString();
	}
}