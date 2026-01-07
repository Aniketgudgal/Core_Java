import java.util.Scanner;
public class PalindromeString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input: ");
		String input = sc.next();
		System.out.println("The String is palindrome: "+palindromeString(input,0));
	}
	public static boolean palindromeString(String in, int i)
	{
		if(i > in.length()/2) // this only going half of string
			return true;
		if(in.charAt(i) != in.charAt(in.length() - i -1)) // this checking the first and last index condition
			return false; // if not match or not equal then return false
		else
			return palindromeString(in, i + 1); // calling itselft
	}
}