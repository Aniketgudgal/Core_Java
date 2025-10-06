// Diamond with Cross in Center
public class Pattern5
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j=1; j <= 9; j++)
			{
				if((j == 6 - i && i <= 5) || (j == i + 4 && i <= 5) || (j == 14 - i && i >= 6) || (j == i - 4 && i >= 6))
				{
					System.out.print("*");
				}
				else if((j == 5 && i >= 4) && (j == 5 && i <= 6))
				{
					System.out.print("+");
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