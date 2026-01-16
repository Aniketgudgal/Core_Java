/*
Q14. Write a program to check whether a string is empty or not.
 Input : " "
 Output : String is empty
*/
import java.util.Scanner;
public class IsEmptyString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String in = sc.nextLine();
		boolean result = isEmpty(in);
		System.out.println("The string isEmpty: "+result);
	}
	public static boolean isEmpty(String s)
	{
		if(s.length() == 0)
		{
			return true;
		}
		int count = 0;
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != 32)
			{
				count++;
			}
		}
		return count > 0 ? false: true;
	}
}