/*
WAP to input string and remove the white spaces from a string?
*/
import java.util.Scanner;
public class RemoveWhiteSpace
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String value: ");
		String val = sc.nextLine();
		String result = removeSpace(val);
		System.out.println("Result String is: "+result);
	}
	public static String removeSpace(String s)
	{
		// string buffer to perfomace improvement
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i)== ' ')
			{
				continue;
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}