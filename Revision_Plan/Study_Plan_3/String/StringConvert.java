import java.util.Scanner;
public class StringConvert
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of String: ");
		String input = sc.next();
		
		// converting string into char array
		char[] ch = new char[input.length()];
		for(int i = 0; i < ch.length; i++)
		{
			ch[i] = input.charAt(i);
		}
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] >= 65 && ch[i] <= 90)
			{
				ch[i] = (char)(ch[i]+32);
			}
		}
		String str = String.valueOf(ch);
		System.out.println("Lower case character: "+str);
	}
}