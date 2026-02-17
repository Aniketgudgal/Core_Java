/*
Clock Angle
Given a time in hours and minutes, calculate the smaller angle between the hour hand and minute hand of an analog clock.
Example
Input: hour = 3, minutes = 15
Output: 7.5 degrees
*/
import java.util.Scanner;
public class ClockAngle
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the hours: ");
		int hour = sc.nextInt();
		System.out.print("Enter the minute: ");
		int minute = sc.nextInt();
		
		if(hour == 12)
		{
			hour = 0;
		}
		double hAngle = 30* hour + 0.5*minute;
		double mAngle = 6*minute;
		double angle = Math.abs(hAngle - mAngle);
		double resultAngle = Math.min(angle, 360- angle);
		System.out.println("The Angle is: "+resultAngle+" degree");
	}
}