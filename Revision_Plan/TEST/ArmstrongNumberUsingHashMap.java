/*
Q7.Write a java program to store N integers in a HashMap. Find all Armstrong numbers.
Input:
6
153 10 370 89 407 25
Output:
Armstrong Numbers: 153 370 407
Description:
Store the given integers in a HashMap where the key is the index and the value is the number.
Traverse the Map values one by one.
For each number:
• Extract digits manually using % 10 and / 10.
• Do not use Math.pow().
*/
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class ArmstrongNumberUsingHashMap
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Hash Map: ");
		int size = sc.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<>();
		System.out.print("Enter the values in Hash Map: ");
		for(int i = 1; i <= size; i++)
		{
			hm.put(i,sc.nextInt());
		}
		for(Map.Entry<Integer,Integer> abc: hm.entrySet())
		{
			boolean result = isArmstrong(abc.getValue());
			if(result)
			{
				System.out.print(abc.getValue()+" ");
			}
		}
	}
	public static boolean isArmstrong(int num)
	{
		int p = 0;
		int temp = num;
		// count all the number power
		while(temp != 0)
		{
			p++;
			temp /= 10;
		}
		int result = 0;
		 temp = num;
		 // take the power of each digit
		while(temp != 0)
		{
			int rem = temp % 10;
			int pw = 1;
			int i = 0;
			// calculate power of number
			while(i != p)
			{
				pw = pw*rem;
				i++;
			}
			result += pw;
			temp /= 10;
		}
		return result == num? true:false;
	}
}