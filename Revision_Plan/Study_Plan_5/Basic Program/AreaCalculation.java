/*
Write a Java program to enter length and breadth of a rectangle and calculate its area.
Input:
Length = 10
Breadth = 5

Output:
Area = 50

Explanation:
The area of a rectangle is calculated using the formula:
Area = Length × Breadth
So, 10 × 5 = 50.
*/
public class AreaCalculation
{
	public static void main(String x[])
	{
		Integer a = Integer.parseInt(x[0]);
		Integer b = Integer.parseInt(x[1]);
		int area = a*b;
		System.out.println("Area is: "+area);
	}
}