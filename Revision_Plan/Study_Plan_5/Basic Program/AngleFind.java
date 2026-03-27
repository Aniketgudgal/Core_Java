/*
Write a Java program to enter two angles of a triangle and find the third angle.
Input:
Angle1 = 50
Angle2 = 60

Output:
Third Angle = 70

Explanation:
The sum of all angles in a triangle is 180°.
Third Angle = 180 ? (Angle1 + Angle2).
*/
import java.util.Scanner;
public class AngleFind
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Angle: ");
		float ang1 = sc.nextFloat();
		System.out.print("Enter the second Angle: ");
		float ang2 = sc.nextFloat();
		float thirdAngle = 180 - (ang1+ang2);
		if( thirdAngle > 0 &&thirdAngle <= 180)
		{
			System.out.println("The Third Angle is: "+thirdAngle);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
}