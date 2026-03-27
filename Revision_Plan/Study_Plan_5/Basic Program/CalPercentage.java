/*
 Write a Java program to enter marks of five subjects and calculate total marks and percentage.
Input:
Marks = 70, 75, 80, 65, 60

Output:
Total = 350
Percentage = 70%

Explanation:
Total marks are calculated by adding all five subject marks.
Percentage = Total ÷ 5.
*/
import java.util.Scanner;
public class CalPercentage
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first subject marks: ");
		int subj1 = sc.nextInt();
		System.out.print("Enter the second subject marks: ");
		int subj2 = sc.nextInt();
		System.out.print("Enter the third subject marks: ");
		int subj3 = sc.nextInt();
		System.out.print("Enter the fourth subject marks: ");
		int subj4 = sc.nextInt();
		System.out.print("Enter the 5th subject marks: ");
		int subj5 = sc.nextInt();
		int totalSubj = subj1+subj2+subj3+subj4+subj5;
		float  percentage = (totalSubj/5);
		System.out.println("The percentage is: "+percentage);
	}
}