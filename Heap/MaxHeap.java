import java.util.Scanner;
public class MaxHeap
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		maxHeadTravel(num,num.length);
		System.out.println("The Max Heap Array is");
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
	}
	public static void maxHeadTravel(int[] arr, int size)
	{
		for(int i = size/2 - 1; i>= 0; i--)
		{
			heapify(arr,i,size);
		}
	}
	public static void heapify(int[] arr, int index, int size)
	{
		int curr = index;
		int left = 2*index+1;
		int right = 2*index+2;
		if(left < size && arr[left] > arr[curr])
		{
			curr = left;
		}
		if(right < size && arr[right] > arr[curr])
		{
			curr = right;
		}
		if(curr != index)
		{
				swap(arr,index, curr);
				heapify(arr,curr,size);
		}
	}
	public static void swap(int[] arr, int s, int e)
	{
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
}