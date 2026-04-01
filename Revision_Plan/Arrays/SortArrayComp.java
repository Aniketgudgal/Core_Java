// sort array using comparator interface
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class SortArrayComp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		Integer[] arr = new Integer[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr,new Comparator<Integer>()
		{
			public int compare(Integer a, Integer b)
			{
				return (a < b ? 1 : a == b ? 0 : -1);
			}
		});
		System.out.println("Sorted Array");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}