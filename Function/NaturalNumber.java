/*
Write a function to find the sum of first n natural numbers.
*/
import java.util.Scanner;
public class NaturalNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the n number: ");
		int n = sc.nextInt();
		naturalNumber(n);
	}
	public static void naturalNumber(int n)
	{
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			sum += i;
			i++;
		}
		System.out.printf("The sum of Natural Number is: %d",sum);
	}
}