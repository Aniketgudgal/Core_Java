/*
Remove vowels from a string
*/
import java.util.Scanner;
public class RemoveVowels
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String s = sc.next();
		StringBuffer sb = new StringBuffer(s);
		for(int i = 0; i < sb.length(); i++)
		{
			char ch = Character.toLowerCase(sb.charAt(i));
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				sb.deleteCharAt(i);
			}
		}
		System.out.println("Removing Vowels from string: "+sb);
	}
}