import java.util.Scanner;
public class StringBufferApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string to print: ");
		StringBuffer sb = new StringBuffer(sc.next());
		for(int i = 0; i < sb.length(); i++)
		{
			System.out.print(sb.charAt(i)+" ");
		}
	}
}