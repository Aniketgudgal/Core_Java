/*
Write a program to input number and check number is palindrome or not?
*/
public class IsPalindromeNumber
{
	public static void main(String x[])
	{
		int num = Integer.parseInt(x[0]);
		int temp = num;
		
		int rev = 0;
		while(temp != 0)
		{
			int rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		
		if(num == rev)
		{
			System.out.println("Given Number is Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}
}