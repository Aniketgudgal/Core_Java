/*
Find Sum of Large Array Using Multiple Threads
Description:
Split an array into multiple parts and calculate the total sum using multiple threads
Example
	Input: [10,20,30,40,50,60]
Output: 210

Concepts Tested
Parallel processing
Thread joining
Shared results
*/
import java.util.concurrent.*;
import java.util.Scanner;
class SumOfTotal implements Callable<Integer>
{
	private int s;
	private int e;
	private int[] arr;
	public SumOfTotal(int[] arr, int s, int e)
	{
		this.arr = arr;
		this.s = s;
		this.e = e;
	}
	public Integer call()
	{
		int sum = 0;
		for(int i = s-1; i < e; i++)
		{
			sum += arr[i];
		}
		System.out.println(Thread.currentThread().getName()+" Sum: "+sum);
		return sum;
	}
}
public class ParallelThreadExecution
{
	public static void main(String x[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the values in Array: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		ExecutorService ex = Executors.newFixedThreadPool(2);
		Future<Integer> t1 = ex.submit(new SumOfTotal(arr,1,arr.length/2));
		Future<Integer> t2 = ex.submit(new SumOfTotal(arr,(arr.length/2)+1,arr.length));
		System.out.println("The Sum of all Thread is: "+(t1.get() + t2.get()));
		ex.shutdown();
	}
}