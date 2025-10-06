//hollow hourglass
public class Pattern4
{
	public static void main(String x[])
	{
		// Butterfly Pattern
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 9; j++)
			{
				if((i== 1 || i == 9)||(j == i && i <= 5) || (j == 10 - i && i <= 5) || (j == 10 - i && i >= 6) || (j == i && i >= 6))
				{
					System.out.print("*");
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