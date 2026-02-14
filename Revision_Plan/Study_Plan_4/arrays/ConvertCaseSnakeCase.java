/*
CamelCase to snake_case
You are given a string written in CamelCase.
Convert it into snake_case.
Rules:
•	All letters must be lowercase.
•	Words are separated using _.
Example
Input: "HelloWorldTest"
Output: "hello_world_test"
*/
import java.util.Scanner;
public class ConvertCaseSnakeCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Camel Case String: ");
		String itp = sc.next();
		String result = snakeCaseConvertor(itp);
		System.out.println("The converted result is: "+result);
	}
	public static String snakeCaseConvertor(String s)
	{
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				if(i != 0)
				{
					sb.append("_");
				}
				sb.append((char)(s.charAt(i) + 32));
			}
			else
			{
				sb.append(s.charAt(i));
			}
		}
		return new String(sb);
	}
}