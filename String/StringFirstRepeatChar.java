import java.util.Scanner;
public class StringFirstRepeatChar
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String in = sc.nextLine();
		boolean flag = true;
		for(int i = 0; i < in.length() - 1; i++)
		{
			for(int j = i+1; j < in.length(); j++)
			{
				if(in.charAt(i) == in.charAt(j))
				{
					System.out.println("First Char is: "+in.charAt(i));
					flag = false;
					break;
				}
			}
			if(!flag)
			{
				break;
			}
		}
	}
}