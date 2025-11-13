/*
7.Find Majority Element (Occurs > n/2 Times)
Concept: Use count method or Boyer-Moore Voting Algorithm.
 Use Case: Identify the dominating product, preference, etc.
Inut : arr = [2, 2, 1, 1, 2, 2, 2]
Size (n) = 7
Majority element is: 2
*/
import java.util.Scanner;
public class MajorityElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.print("Enter values in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		for(int i =0; i < num.length; i++)
		{
			for(int j = i+1; j < num.length; j++)
			{
				if(num[i] > num[j])
				{
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		int count = 0;
		int check = (num.length/2);
		int number = 0;
		for(int i = 0; i <num.length; i++)
		{
			for(int j = 0; j < num.length; j++)
			{
				if(num[i] == num[j])
				{
					count++;
				}
			}
			if(count >= check && number != num[i])
			{
				System.out.println("Majority count is: "+num[i]);
				number = num[i];
			}
			count= 0;
		}
	}
}