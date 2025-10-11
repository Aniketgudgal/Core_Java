//4. Subarray Product < K
import java.util.Scanner;
public class SubarrayProduct
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int nums[] = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.print("Enter the values of k: ");
		int k = sc.nextInt();
		int count = 0;
		int l = 0, r = 0,product = 1;
		while(r < nums.length)
		{
			product *= nums[r];
			if(product < k)
			{
				count += (r - l + 1);
			}
			while(product >= k)
			{
				product /= nums[l];
				l++;
			}
			r++;
		}
		System.out.println("The total count is: "+count);
	}
}