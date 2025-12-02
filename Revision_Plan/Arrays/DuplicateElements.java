/*
find duplicates values from array
*/
public class DuplicateElements
{
	public static void main(String x[])
	{
		int a[] = new int[] {1,2,2,1,3,3,4,5,6};
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 0; j < a.length; j++)
			{
				if(a[i] == a[j])
					count++;
			}
			boolean flag = true;
			for(int k = 0; k < i; k++)
			{
				if(a[k] == a[i])
				{
					flag = false;
					break;
				}
			}
			if(count > 1 && flag)
			{
				System.out.println(a[i]);
			}
		}
	}
}