//Q15.Alphabet Zig-Zag Wave?
public class Pattern15
{
	public static void main(String x[])
	{
		char ch = 'A';
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(j == i || j == 6 - i)
				{
					System.out.print(" "+ch++);
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}