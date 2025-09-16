/*
Write a function to check if a number is an automorphic number (last digits = square of number).
*/

// not solve


import java.util.Scanner;
public class AutomorphicNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int n = sc.nextInt();
		automorphicNumber(n);
	}
	public static void automorphicNumber(int n)
	{
		int number = n *n;
		int temp = n;
		int digit = 0;
		while(temp != 0)
		{
			digit++;
			temp /= 10;
		}
		int store = 1 ;
		int digitCount = digit;
		while(digit != 0)
		{
			int rem = number % 10;
			store  = store*10 + rem;
			digit--;
			number = number / 10;
		}
		int k = store;
		int store1 = 1;
		while(k != 0)
		{
			int rem = k % 10;
			store1  = store1*10 + rem;
			k = k / 10;
		}
		if(store1 == n)
		{
			System.out.printf("The number is automorphic");
		}
		else
		{
			System.out.printf("The number is not automorphic");
		}
	}
}