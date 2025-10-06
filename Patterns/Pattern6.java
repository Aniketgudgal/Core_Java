// Pascal-Inspired Triangle with Stars
public class Pattern6
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 9; i++)
		{
			for(int j = 1; j <= 17; j++)
			{
				if((i == 9) || (j == 10 - i) || (j == 8+i))
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