/*
Q13. Write a program to compare two strings.
 Input: String1- Java, String2- Java
 Output : Strings are equal
*/
import java.util.Scanner;
public class CompareString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String firstInput  = sc.nextLine();
		System.out.print("Enter the second String: ");
		String secondInput = sc.nextLine();
		boolean result = checkString(firstInput.toLowerCase(), secondInput.toLowerCase());
		System.out.println("The Two String are equals: "+result);
	}
	public static boolean checkString(String in1, String in2)
	{	
		if(in1.length() != in2.length())
		{
			return false;
		}
		for(int i = 0; i < in1.length(); i++)
		{
			if(((in1.charAt(i) >= 97 && in1.charAt(i) <= 122)) && ((in2.charAt(i) >= 97 && in2.charAt(i) <= 122)))
			{
				if(in1.charAt(i) != in2.charAt(i))
				{
					return false;
				}
			}
			else 
			{
				return false;
			}
		}
		return true;
	}
}