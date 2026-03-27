/*
Write a Java program to convert seconds into hours, minutes, and seconds.
Input:
Seconds = 3665

Output:
Hours = 1
Minutes = 1
Seconds = 5

Explanation:
1 hour = 3600 seconds.
3665 ÷ 3600 gives 1 hour.
Remaining seconds are converted into minutes and seconds using division and modulus operations.
*/
import java.util.Scanner;
public class ConvertSecond
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the second: ");
		int second = sc.nextInt();
		int hour = second /3600;
		int rem = second%3600;
		int min = rem/60;
		int sec = rem%60;
		System.out.println("The hours is: "+hour);
		System.out.println("The minutes is: "+min);
		System.out.println("The second is: "+sec);
	}
}