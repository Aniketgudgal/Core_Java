/*
WAP to input string and count the words from a string using split() method?
*/
import java.util.Scanner;
public class CountWord
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string value: ");
		String val = sc.nextLine();
		int result = countWord(val);
		System.out.println("The Total Words are: "+result);
	}
	public static int countWord(String s)
	{
		String[] val = s.split(" ");
		return val.length;
	}
}