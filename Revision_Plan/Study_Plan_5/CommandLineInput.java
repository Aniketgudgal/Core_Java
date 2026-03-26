/*
Question 1: Write a Java program to display the message "This is first java program" on the screen.
Input : No input
Output : This is first java program
Explanation: The program simply prints a fixed message without taking any input.
*/
public class CommandLineInput
{
	public static void main(String x[])
	{
		String a = x[0]+" "+x[1];
		System.out.println("The command line input is: ā"+a);
	}
}