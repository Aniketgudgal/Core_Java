import java.util.Scanner;
public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n th number: ");
		int nth = sc.nextInt();
		int i = 1;
		while(i <= nth)
		{
			int temp = i;
			int sum = 0;
			int fact = 1;
			while(temp != 0)
			{
				int rem = temp % 10;
				fact = 1;
				while(rem != 0)
				{
					fact = fact*rem;
					rem --;
				}
				sum += fact;
				temp /= 10;
			}
			if(sum == i)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}