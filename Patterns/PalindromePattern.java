public class PalindromePattern
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			int p = 0;
			for(int j = 1; j <= 9; j++)
			{
				if(j < (i*2))
				{
					if(j <= i)
					{
						System.out.print(++p +" ");
					}
					else
					{
						System.out.print(--p +" ");
					}
				}
			}
			System.out.println();
		}
	}
}