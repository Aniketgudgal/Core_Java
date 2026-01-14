public class PatternDia
{
	public static void main(String x[])
	{
		int n = 9;
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n; j++)
			{
				if((j == 6 -i && i < 5) || (j == 7 + i && i < 5))
				{
					System.out.print("*");
				}
				else if(j == 5)
				{
					System.out.print("*");
				}
				else if((i > 5 && j == 8 - i) || (i > 5 && j <= 9 - i))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}