/*
 Write a program in java to find the Floor and Ceil of the number 0 to 10 from a sorted array.
Expected Output :
 The given array is : 1 3 5 7 8 9
 Number: 0 ceiling is: 1 floor is: -1
 Number: 1 ceiling is: 1 floor is: 1
 Number: 2 ceiling is: 3 floor is: 1
 Number: 3 ceiling is: 3 floor is: 3
 Number: 4 ceiling is: 5 floor is: 3
 Number: 5 ceiling is: 5 floor is: 5
 Number: 6 ceiling is: 7 floor is: 5
 Number: 7 ceiling is: 7 floor is: 7
 Number: 8 ceiling is: 8 floor is: 8
 Number: 9 ceiling is: 9 floor is: 9
 Number: 10 ceiling is: -1 floor is: 9
*/
import java.util.Scanner;
public class FloorCeil
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[] {1,3,5,7,8,9};
		int i = 0;
		int k = 0;
		int ceil = arr[k];
		int floor = -1;
		while(i <= 10)
		{
			if(i == ceil)
			{
				floor = ceil;
				System.out.println("Number: "+i+" ceiling: "+ceil+" floor is: "+floor);
				if(k == arr.length - 1)
				{
					ceil = -1;
				}
				else
				{
					ceil = arr[++k];
				}
				i++;
				continue;
			}
			System.out.println("Number: "+i+" ceiling: "+ceil+" floor is: "+floor);
			i++;
		}
	}
}