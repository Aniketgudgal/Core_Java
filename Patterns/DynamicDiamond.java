//Diamond of Numbers
public class DynamicDiamond
{
	public static void main(String x[])
	{
		int n = 6; // this is the size of diamond in dynamic. the diamond only accept the even number value 
		for(int i = 1; i <= n; i++)
		{
			for(int j=1; j <= n -1; j++)
			{
				if(((i <= ((n)/2) && j == (n/2)+1 - i) || (j == (n/2)-1 + i)) || ((i >= ((n)/2))&& (j == i -(n/2)) ||
				(j == (n*2)- (n/2) - i) ))
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