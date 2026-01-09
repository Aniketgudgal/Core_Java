/*
Write a program to find the length of a string.
 Input : Programming
 Output : 11
*/
import java.util.Scanner;
public class LengthOfString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String len = sc.nextLine();
		int count = 0;
		int i = 0;
		while(i < len.length())
		{
			if((len.charAt(i)>= "A" && len.charAt(i) <= "Z" 
			) || (len.charAt(i) >= "a" && len.charAt(i) <= "z"))
				count++;
		}
		System.out.println("The Length of String is: "+count);
	}
}