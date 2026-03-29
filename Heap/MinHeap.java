import java.util.Scanner;
// this algorithm work with the binary tree and produce the min number to starting of array
public class MinHeap
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
		minHeapTravel(num,num.length);
		System.out.println("The Min Heap Array is");
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i] + " ");
		}
		// sort array using heap technique
		sortArray(num);
		System.out.println("\nSorted array");
		for(int i = 0; i < num.length; i++)
		{
			System.out.print(num[i]+" ");
		}
	}
	public static void sortArray(int[] num)
	{
		for(int i = num.length -1; i> 0; i--)
		{
			// swap first min element to last index
			// decrement size from last index
			// apply heapify to the remaining element and take min value to first index i.e 0th index
			swap(num,0,i);
			heapify(num,0,i);
		}
	}
	public static void minHeapTravel(int[] arr, int size)
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
		if(left < size && arr[left] < arr[curr])
		{
			curr = left;
		}
		if(right < size && arr[right] < arr[curr])
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