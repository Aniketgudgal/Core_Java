import java.util.Scanner;
public class ReverseString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the input String: ");
		StringBuffer sb = new StringBuffer(sc.next());
		// logic to reverse string 
		int i = 0;
		int j = sb.length()-1;
		while(i < j)
		{
			char ch = sb.charAt(i);
			sb.setCharAt(i,sb.charAt(j));
			sb.setCharAt(j, ch);
			i++;
			j--;
		}
		System.out.println("The Reverse String is: "+sb);
		
	}
}