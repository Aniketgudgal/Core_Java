/*
Write a program to find the sum of first n natural numbers using recursion.
*/
public class SumOfNaturalNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int result = sum(num,0);
		System.out.println("The sum of natural number is: "+result);
	}
	static int sum(int n, int sum)
	{
		if(n < 0)
		{
			return sum;
		}
		else
		{
			return sum(n-1,sum +=n);
		}
	}
}