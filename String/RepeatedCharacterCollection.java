import java.util.Scanner;
import java.util.ArrayList;
public class RepeatedCharacterCollection
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string input: ");
		String in = sc.nextLine();
		ArrayList<Character> al = new ArrayList<>();
		for(int i = 0; i < in.length(); i++)
		{
			if(al.contains(in.charAt(i)))
			{
				System.out.println("First character is: "+in.charAt(i));
				break;
			}
			else
			{
				al.add(in.charAt(i));
			}
		}
	}
}