/*
Write a Java program to calculate the area of an equilateral triangle.
Input : Side = 6
Output : Area = 15.59
Explanation : Area is calculated using the formula for equilateral triangles.
*/
import java.util.Scanner;
public class AreaEquilateral
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the side: ");
		int side = sc.nextInt();
		float area = (float)((side*side)*(Math.sqrt(3)/4));
		System.out.println("The Area is: "+area);
	}
}