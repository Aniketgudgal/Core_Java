/*
String Compression
Compress a string by replacing consecutive repeating characters with character + count.
Example
Input: "aabcccccaaa"
Output: "a2b1c5a3"
*/
import java.util.Scanner;
public class StringCompression
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String ipt = sc.nextLine();
		String result = stringCompression(ipt);
		System.out.println("The encoded string is: "+result);
	}
	public static String stringCompression(String s)
	{
		int count = 0;
		char ch = ' ';
		s += " ";
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < s.length(); i++)
		{
			if(count <= 0)
			{
				count++;
				ch = s.charAt(i);
			}
			else if(ch != s.charAt(i))
			{
				sb.append(ch);
				sb.append(count);
				count = 1;
				ch = s.charAt(i);
			}
			else
			{
				count++;
			}
		}
		return new String(sb);
	}
}