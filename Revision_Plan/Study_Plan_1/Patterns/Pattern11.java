//Q11.Zig-Zag Number Wave?
import java.util.Scanner;
public class Pattern11
{
	public static void main(string x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		int num = 1;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if(i == j || j == (n+1 - i))
				{
					System.out.print(" "+num++);
				}
				else
				{
					System.out.print("  ");
				}
			}
		}
	}
}
