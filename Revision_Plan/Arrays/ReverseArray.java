//5. Reverse an Array
import java.util.Scanner;
public class ReverseArray
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int num[] = new int[size];
		System.out.print("Enter the values in array: ");
		for(int i = 0; i < num.length; i++)
		{
			num[i] = sc.nextInt();
		}
		// reverse array logic using two pointer
		int k = 0; 
		int j = num.length - 1;
		while(k < j)
		{
			num[k] = num[k] + num[j];
			num[j] = num[k] - num[j];
			num[k] = num[k] - num[j];
			k++;
			j--;
		}
		// display array
		for(int i= 0; i < num.length; i++)
		{
			System.out.print(" "+num[i]);
		}
	}
}