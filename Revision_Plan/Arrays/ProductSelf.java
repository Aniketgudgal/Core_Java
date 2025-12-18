public class ProductSelf
{
	public static void main(String x[])
	{
		int arr[] = new int[]{1,2,3,4};
		int res[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
		{
			int pre = preSum(arr,i); 
			int suffSum = sumProduct(arr, i+1);
			int result = pre*suffSum;
			res[i] = result;
		}
		System.out.println("Result");
		for(int i = 0; i < res.length; i++)
		{
			System.out.print(" "+res[i]);
		}
	}
	static int preSum(int a[], int end)
	{
		int pro = 1;
		for(int i = 0; i < end; i++)
		{
			pro = pro*a[i];
		}
		return pro;
	}
	static int sumProduct(int a[] , int s)
	{
		int pro = 1; //  2 //6//24
		for(int i = s; i < a.length; i++)
		{
			// 2 3 4
			pro = pro*a[i]; // 1*2 = 2 // 2*3 = 6 // 6*4
		}
		return pro;
	}
}