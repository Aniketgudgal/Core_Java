/*
WAP to input string and convert lower case string to upper case without using
toUpperCase() method?
*/
import java.util.Scanner;
public class ConvertStringUpperCaseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String val = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < val.length(); i++)
		{
			if(val.charAt(i) >= 'A' && val.charAt(i) <= 'Z')
			{
				char ch = (char)(val.charAt(i)+32);
				sb.append(ch);
			}
			else
			{
				sb.append(val.charAt(i));
			}
		}
		System.out.println("Converted String is: "+sb.toString());
	}
}