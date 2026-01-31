import java.util.Scanner;
public class Zeros
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string zeros and one: ");
		String s = sc.next();
		char[] ch = new char[s.length()];
		for(int i = 0; i < ch.length; i++)
		{
			ch[i] = s.charAt(i);
		}
		int zero = 0;
		int t = 0;
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == '0')
			{
				zero++;
				
			}
			else
			{
				if(zero > 0)
				{
					if((t+1) > zero)
					{
						t = t+1;
					}
					else
					{
						t = zero;
					}
				}
			}
		}
		System.out.println("result is: "+t);
	}
}