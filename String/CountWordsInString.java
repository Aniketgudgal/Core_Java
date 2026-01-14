/*
Write a program to count total words in a string.
 Input : Java is easy
 Output : 3
*/
import java.util.Scanner;
public class CountWordsInString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String in = sc.nextLine();
		int result = countWords(in);
		System.out.print("Total World is: "+result);
	}
	public static int countWords(String in)
	{
		int count = 1;
		String s = in.toLowerCase();
		try{
		int i = 0;
			while(i < s.length() - 1)
			{
				if(s.charAt(i) >= 97 && s.charAt(i) <= 122 && s.charAt(i + 1) == 32)
				{
					count++;
				}
				i++;
			}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String out of bound");
		}
		return count;
	}
}