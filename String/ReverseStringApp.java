import java.util.Scanner;
public class ReverseStringApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String in = sc.nextLine();
		String result = ReverseString.reverseString(in);
		System.out.println("Reverse String is: "+result);
	}
}
class ReverseString
{
	// utility class
	private ReverseString(){};
	public static String reverseString(String s)
	{
		String sb = "";
		for(int i = s.length() - 1; i >= 0 ; i--)
		{
			sb = sb + s.charAt(i);
		}
		
		return sb;
	}
}