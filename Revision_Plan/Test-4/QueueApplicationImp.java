/*
Write a Java program to design queue using array and reverse elements without extra
data structure.
Explanation
Use swapping logic:
• First element ↔Last element
• Continue till middle.
Input :10 20 30
Output : 30 20 10
*/
import java.util.Scanner;
class Queue
{
	int count = 0;
	int size;
	int arr[];
	Queue(int[] arr)
	{
		this.arr = arr;
	}
	public void remove()
	{
		System.out.println("Remove Element is: "+arr[count]);
		count++;
	}
	public void reverseQueue()
	{
		int i = count;
		int j = arr.length - 1;
		while(i < j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	public void showQueue()
	{
		if(count == arr.length)
		{
			System.out.println("Queue is Empty");
			return;
		}
		for(int i = count; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class QueueApplicationImp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Queue: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter the value in Queue: ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Welcome to Queue Application");
		String exit = "";
		Queue q = new Queue(arr);
		do
		{
			System.out.println("1. Delete Element from queue \n2. Display Queue\n3. Reverse Queue\n4. Exit");
			int choose = sc.nextInt();
			switch(choose)
			{
				case 1:
					q.remove();
					break;
				case 2: 
					q.showQueue();
					break;
				case 3: 
					q.reverseQueue();
					break;
				case 4:
					exit = "yes";
					break;
				default:
					System.out.println("Enter the valid input ");
					break;
			}
		}while(!exit.equals("yes"));
	}
}