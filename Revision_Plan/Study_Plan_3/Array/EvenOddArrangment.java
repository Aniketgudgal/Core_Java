/*
Rearrange elements so even and odd elements alternate (same count assumed).
Input: [1, 2, 3, 4, 5, 6]
Output: [2, 1, 4, 3, 6, 5]
*/
public class EvenOddArrangment
{
	public static void main(String x[])
	{
		int arr[] = new int[]{1,2,3,4,5,6};
		int odd = 1;
		int even = 0;
		int i = 0;
		while(i < arr.length)
		{
			if(i % 2 == 0)
			{
				if(arr[i] % 2 != 0)
				{
					if(even < arr.length)
					{
						int temp = arr[i];
						arr[i] = arr[even];
						arr[even] = temp;
						even += 2;
					}
				}
			}
			else
			{
				if(arr[i] % 2  != 1)
				{
					if(odd< arr.length)
					{
						int temp = arr[i];
						arr[i] = arr[odd];
						arr[odd] = temp;
						odd += 2;
					}
				}
			}
			i++;
		}
		for(i = 0; i < arr.length; i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}