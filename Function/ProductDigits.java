/*
Write a function to find the product of digits of a given number.
*/
import java.util.Scanner;
public class ProductDigits
{
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		int num = xyz.nextInt();
		int result = productOfDigits(num);
		System.out.printf("The product of digit is: %d",result);
		
	}
	
	public static int productOfDigits(int n)
	{
		int product = 1;
		while(n != 0)
		{
			int rem = n % 10;
			product *= rem;
			n /= 10;
		}
		return product;
	}
}