/*
Write a function to find the sum of cubes of first n natural numbers.
*/
import java.util.Scanner;
public class SumCubeNaturalNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the nth Number: ");
		int n = sc.nextInt();
		int result = cubeNaturalNumber(n);
		System.out.printf("The first nth natural number sum is: %d",result);
	}
	public static int cubeNaturalNumber(int n)
	{
		int temp = n;
		int i = 1;
		int sum = 0;
		while(i <= n)
		{
			sum += i*i*i;
			i++;
		}
		return sum;
	}
}