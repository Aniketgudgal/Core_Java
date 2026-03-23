//Q1. Write a java program to print this pattern.
public class PatternApp
{
	public static void main(String x[])
	{
		int n = 9;
		for(int i = 1; i <= n; i++)
		{
			char ch = 'A';
			for(int j = 1; j <= n; j++)
			{
				if((j >= 6-i && j <= 4 + i && i <= 5) || (j >= i - 4 && j <= 14 - i && i > 5))
				{
					
					if(i % 2 == 0)
					{
						System.out.print("# ");
					}
					else
					{
						if(j <= n /2)
						{
							System.out.print(ch+++" ");
						}
						else
						{
							System.out.print(ch--+" ");
						}
					}
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