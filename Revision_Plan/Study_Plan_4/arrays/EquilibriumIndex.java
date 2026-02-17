/*
Equilibrium Index
Find an index such that the sum of elements to the left equals the sum of elements to the right.
Return -1 if no such index exists.

Input: [1, 3, 5, 2, 2]

Index 2:
Left sum = 1 + 3 = 4
Right sum = 2 + 2 = 4

Output: 2
*/
import java.util.Scanner;
public class EquilibriumIndex
{
	public static void main(String x[])
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
		int result = equilibriumIndex(arr);
		System.out.println("Equilibrium Index is: "+result);
	}
	public static int equilibriumIndex(int[] arr)
	{
		int total = 0;
		for(int x: arr)
		{
			total += x;
		}
		int leftSum = 0;
		int index = -1;
		for(int i= 0; i < arr.length; i++)
		{
			int rightSum = total - leftSum - arr[i];
			if(rightSum == leftSum)
			{
				index = i;
				break;
			}
			leftSum += arr[i];
		}
		return index;
	}
}