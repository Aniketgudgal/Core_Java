/*
4. Player High Score
Task:
 Create a Player class with fields: name and score.
 In the main method:
Create two individual Player objects.
Compare their scores and print the name of the player with the higher score.
Explanation:
 This helps to understand comparing fields between objects.
*/
import java.util.Scanner;
class Player
{
	private String name;
	private int score;
	void setName(String name)
	{
		this.name = name;
	}
	String getName()
	{
		return name;
	}
	void setScore(int score)
	{
		this.score = score;
	}
	int getScore()
	{
		return score;
	}
}
class HigherScore
{
	Player[] p;
	Scanner sc = new Scanner(System.in);
	void setClass(Player[] p)
	{
		this.p = p;
		//input data of players
		for(int i = 0; i < p.length; i++)
		{
			p[i] = new Player();
			System.out.printf("Enter the name of player: ");
			String name = sc.next();
			System.out.printf("Enter the score of player: ");
			int score = sc.nextInt();
			p[i].setName(name);
			p[i].setScore(score);
		}
	}
	void showHigherScore(Player[] p)
	{
		// main logic of code
		int scp = 0;
		int maxPlayer = 0;
		for(int i = 0; i < p.length; i++)
		{
			if(p[i].getScore() > maxPlayer)
			{
				maxPlayer = p[i].getScore();
				scp = i;
			}
		}
		//display higher score player
		System.out.printf("\n");
		System.out.print("The Higher Score player is: "+p[scp].getName()+"\t Score of player is: "+p[scp].getScore());
	}
}
public class HigherScorePlayerApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		//size of players
		System.out.printf("Enter the total player: ");
		int size = sc.nextInt();
		
		Player[] p = new Player[size];
		
		// object of higher class and class the methods of that class
		HigherScore hs = new HigherScore();
		hs.setClass(p);
		hs.showHigherScore(p);
	}
}