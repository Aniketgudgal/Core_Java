import java.util.Arrays;

public class UniquePairs
{
    public static void main(String[] args)
	{
        int[] nums = new int[]{1, 5, 7, -1, 5, 3, 3};
        int s = 6;

        Arrays.sort(nums); // sort first
        int l = 0;
        int r = nums.length - 1;
        while (l < r) 
		{
            int sum = nums[l] + nums[r];
            if (sum == s) 
			{
                // print the pair
                System.out.println("(" + nums[l] + ", " + nums[r] + ")");

                // skip duplicates for left value
                int leftVal = nums[l];
                while (l < r && nums[l] == leftVal) l++;

                // skip duplicates for right value
                int rightVal = nums[r];
                while (l < r && nums[r] == rightVal) r--;
            } 
			else if (sum < s) 
			{
                l++;
            } 
			else
			{
                r--;
            }
        }
    }
}
