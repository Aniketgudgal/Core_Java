/*
10. Find the Area of a Circle
Create a class CircleArea with a method findArea that calculates the area given the radius.
There are 3 formulas to sovle this problem
1.(Pi) times the Radius squared:    A = π r^2
2. when you know the Diameter:      A = (π/4) × D^2
3. when you know the Circumference:  A = C^2 / 4π
*/

import java.util.Scanner;
public class AreaApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the radius of circle: ");
		float radius = sc.nextInt();
		AreaOfCircle a1 = new AreaOfCircle();
		float result = a1.area(radius);
		System.out.printf("The area of circle is: %f",result);
	}
}
class AreaOfCircle
{
	// logic
	float area(float r)
	{
		float result = (float)((3.14)*(r*r));
		return result;
	}
}