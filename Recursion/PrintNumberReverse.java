/*
Write a program to print numbers from n down to 1 using recursion.
*/
import java.util.Scanner;
public class PrintNumberReverse
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		
		printNum(n);
	}
	static void printNum(int num)
	{
		if(num < 1)
		{
			System.out.println("end");
		}
		else{
			System.out.println(num);
			printNum(num - 1);
		}
	}
}