/*
Write program to input number using Scanner class and reverse it?
*/
import java.util.Scanner;
public class Reverse
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int rev = 0;
		int rem = 0;
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		System.out.println("The Reverse Number is: "+rev);
	}
}