/*
Write a Java program using recursion to display series:
2 6 12 20 30 42 56 72 90 110
4 6 8 10 12 14  16 18 20
*/
import java.util.Scanner;
public class SeriesDisplay
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the series length: ");
		int len = sc.nextInt();
		printSeries(0, 2, 0 ,len);
	}
	public static void printSeries(int i, int j, int s, int len)
	{
		if(s == len)
		{
			return;
		}
		System.out.println(i+j);
		printSeries((i+j), j+2, s+1, len);
	}
}