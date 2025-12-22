import java.util.*;
public class Pattern
{
	public static void main(String x[])
	{
		for(int i = 1; i <= 5; i++)
		{
			boolean flag = true;
			for(int j = 1; j <= 9; j++)
			{
				if(i < 3 && (j <= 10 - i && j >= i) && flag)
				{
					System.out.print("*");
					flag = false;
				}
				else if(i >= 3 && (j >= 6 - i && j <= 4+i) && flag)
				{
					System.out.print("*");
					flag = false;
				}
				else
				{
					System.out.print(" ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}