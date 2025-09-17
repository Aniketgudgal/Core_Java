/*
6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/
import java.util.Scanner;
public class MaxThirdApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the first value: ");
		int v1 = sc.nextInt();
		System.out.printf("Enter the second value: ");
		int v2 = sc.nextInt();
		System.out.printf("Enter the third value: ");
		int v3 = sc.nextInt();
		MaxFind p1 = new MaxFind();
		int result = p1.maxThird(v1,v2,v3);
		System.out.printf("The Max Number is: %d",result);
	}
}
class MaxFind
{
	int maxThird(int v1, int v2, int v3)
	{
		if(v1 > v2 && v1 > v3)
		{
			return v1;
		}
		else if(v2 > v1 && v2 > v3)
		{
			return v2;
		}
		else
		{
			return v3;
		}
	}
}
