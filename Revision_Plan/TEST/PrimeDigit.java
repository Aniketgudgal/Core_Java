/*
Q3. Write a java program to take input array from user and perform operations in array.
 Store only prime number at the same index of digit.
 Input :- 5732 8659 2534 9625 7354 1325
Output :- 2573 5 253 25 357 235
*/
import java.util.Scanner;
public class PrimeDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n numbe: ");
		int i = 2;
		int n = sc.nextInt();
		while(i != n)
		{
			int j = 2;
			boolean flag = true;
			while(j < i)
			{
				if(i % j == 0)
				{
					flag = false;
					break;
				}
				j++;
			}
			if(flag)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}