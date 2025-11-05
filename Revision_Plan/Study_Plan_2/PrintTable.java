/*
Write a program to input number and print its table?
*/

import java.util.Scanner;
public class PrintTable
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		int i = 1;
		while(i <= 10)
		{
			System.out.print(" "+n*i);
			i++;
		}
	}
}