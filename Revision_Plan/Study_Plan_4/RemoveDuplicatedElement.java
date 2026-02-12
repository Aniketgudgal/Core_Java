import java.util.Scanner;
public class RemoveDuplicatedElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		// sorting of array
		for(int i = 0; i < arr.length - 1; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		// remove duplicate logic
		int count = 0;
		int i = 0;
		int j = 1;
		while(j < arr.length)
		{
			if(arr[i] != arr[j])
			{
				i++;
				arr[i] = arr[j];
				count++;
			}
			j++;
		}
		// print the array
		for(i = 0; i <= count; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}