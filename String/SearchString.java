/*
WAP to input string and input second string and search second string in first input string
using
indexOf() method?
Example: First String: Good Morning India
Second string: Morning
Output: String found
*/
import java.util.Scanner;
public class SearchString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first String value: ");
		String first = sc.nextLine();
		System.out.print("Enter search String value: ");
		String search = sc.next();
		int index = first.indexOf(search);
		if(index != -1)
		{
			System.out.println("String found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
}