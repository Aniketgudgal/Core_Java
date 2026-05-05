/*
WAP to input string and reverse the string without using any inbuilt function?
*/
import java.util.Scanner;
public class ReverseStringStringBuffer
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String val = sc.nextLine();
		StringBuffer sb = new StringBuffer();
		for(int i = val.length() - 1; i >= 0; i--)
		{
			sb.append(val.charAt(i));
		}
		System.out.println("Reverse String is: "+sb.toString());
	}
}