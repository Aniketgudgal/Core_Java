/*
Q1. Write a program in java to print next greater elements in a given unsorted array. Elements for which no greater element exists, consider the next greater element as -1.
		Expected Output :
		The given array is : 5 3 10 9 6 13
		Next Bigger Elements are:
		Next bigger element of 5 in the array is: 10
		Next bigger element of 3 in the array is: 10
		Next bigger element of 10 in the array is: 13
		Next bigger element of 9 in the array is: 13
		Next bigger element of 6 in the array is: 13
		Next bigger element of 13 in the array is: -1
		Next Bigger Elements Array:
		10 10 13 13 13 -1
*/
public class BiggerNextElement
{
	public static void main(String x[])
	{
		int nums[] = new int[]{5,3,10,9,6,13};
		for(int i = 0; i < nums.length - 1; i++)
		{ 
			for(int j = i+1; j < nums.length; j++)
			{
				if((nums[j] > nums[i]))
				{
					System.out.print(" "+nums[j]);
					//flag = false;
					if(i == (nums.length -2))
					{	System.out.print(" "+(-1));
					}
					break;
				}
			}
		}
	}
}