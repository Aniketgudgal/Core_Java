import java.util.Scanner;
public class MedianTwoSortedArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
		int size = sc.nextInt();
		int[] nums1 = new int[size];
		System.out.print("Enter the values in first array: ");
		for(int i = 0; i < nums1.length; i++)
		{
			nums1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of second array: ");
		size = sc.nextInt();
		int[] nums2 = new int[size];
		System.out.print("Enter the values in second array: ");
		for(int i = 0; i < nums2.length; i++)
		{
			nums2[i] = sc.nextInt();
		}
		int i = 0;
		int j = 0;
		int k = 0;
		int[] arr = new int[nums1.length + nums2.length];
		while(i < nums1.length)
		{
			if(nums1[i] < nums2[j])
			{
				arr[k] = nums1[i];
				i++;
				k++;
			}
			else
			{
				arr[k] = nums2[j];
				j++;
				k++;
			}
		}
		while(j < nums2.length)
		{
			arr[k] = nums2[j];
			k++;
			j++;
		}
		System.out.println("Result array is: ");
		i = 0;
		for(i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}