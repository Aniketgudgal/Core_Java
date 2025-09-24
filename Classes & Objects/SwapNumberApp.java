/*
15. Swap Two Numbers
Create a class Swapper with a method swap that swaps the values of two numbers without using a third variable.
Explanation: Covers mathematical operations for swapping.
*/
import java.util.Scanner;
class Swapper
{
	int[] swap(int num1, int num2)
	{
		int swapArr[] = new int[2];
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		swapArr[0] = num1;
		swapArr[1] = num2;
		return swapArr;
	}
}
public class SwapNumberApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.printf("Enter the second number: ");
		int num2 = sc.nextInt();
		Swapper s1 = new Swapper();
		int arr[] = s1.swap(num1,num2);
		System.out.printf("The first number is: %d\n",arr[0]);
		System.out.printf("The second number is: %d\n",arr[1]);
	}
}