/*
7. Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/
import java.util.Scanner;
public class VotingApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		// take input from user
		System.out.printf("Enter the age of voter: ");
		int age = sc.nextInt();
		// creating the object of VotingElig class and store that class reference in the v1 reference variable
		VotingElig v1 = new VotingElig();
		// through the reference address we can call the vote method inside of the VotingElig class
		boolean result = v1.isEligible(age);
		// checking the condition is true or false
		if(result)
		{
			System.out.printf("The voter is eligible for vote");
		}
		else
		{
			System.out.printf("The vote is not eligible to vote");
		}
	}
}
class VotingElig
{
	// main logic of this program
	boolean isEligible(int n)
	{
		if(n >= 18)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}