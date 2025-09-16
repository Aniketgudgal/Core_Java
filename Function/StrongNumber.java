/*
Write a function to check if a number is a strong number (sum of factorial of digits = number).
*/
import java.util.Scanner;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int n = sc.nextInt();
		boolean result = strongNumber(n);
		if(result)
		{
			System.out.printf("The %d is Strong Number",n);
		}
		else
		{
			System.out.printf("The %d is Not Strong Number",n);
		}
	}
	
	public static boolean strongNumber(int n)
	{
		int temp = n;
		int fact = 1;
		int sum = 0;
		while(n != 0) // 145 
		{
			int rem = n % 10;// 145= 5
			fact = 1;
			while(rem != 0) // 5!=0//4!=0//3!=0// 2!=0//1!=0
			{
				fact = fact*rem;// 5*1//4*5=20//20*3=60//60*2=120//120*1=120
				rem--;//4//3//2//1//0
			}
			sum += fact;
			n /= 10;//
		}
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}