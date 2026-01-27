public class BinarySearch
{
	public static void main(String x[])
	{
		int[] nums = new int[]{11,13,15,17};
		int i = 0;
        int j = nums.length - 1;
        int ans = nums[0];
        while(i <= j)
        {
            int mid = i + (j - i)/2;
            if(nums[mid] >= nums[0])
            {
                i = mid + 1;
            }
            else
            {
                ans = nums[mid];
                j = mid - 1;
            }
        }
		System.out.println(" "+ans);
	}
}