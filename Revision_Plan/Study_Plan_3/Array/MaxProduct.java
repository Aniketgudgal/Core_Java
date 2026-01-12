public class MaxProduct
{
	public static void main(String x[])
	{
		int[] nums = new int[]{-100, -98, -1, 2, 3, 4};
		 int end = nums.length - 1;
        int arr1 = nums[end] * nums[end-1] * nums[end-2];
        int arr2 = nums[0] *nums[1]*nums[end-1];
         System.out.println(Math.max(arr1,arr2));
	}
}