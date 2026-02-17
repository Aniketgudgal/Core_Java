/*
"11:30:00AM" -> "11:30:00"
"11:30:00PM" -> "23:30:00"
*/
import java.util.Scanner;
public class StringTimeConvert
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the time: ");
		String s = sc.next(); 
		int hour = 0;
		int min = 0;
		int sec = 0;
		String duration = "";
		int count = 0;
		String rev = "";
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ':')
			{
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
				{
					rev += s.charAt(i);
				}
				else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					duration += s.charAt(i);
				}
			}
			else
			{
				count++;
				if(count == 1)
				{
					hour = Integer.parseInt(rev);
					rev = "";
				}
				else if(count == 2)
				{
					min = Integer.parseInt(rev);
					rev = "";
				}
				else
				{
					sec = Integer.parseInt(rev);
				}
			}
		}
		/*
		// 11:30:00AM 
		"11:30:00AM" -> "11:30:00"
		"11:30:00PM" -> "23:30:00"
		*/
		if(duration.equals("AM"))
		{
			if(hour == 12)
				hour = 0;
		}	
		else
		{
			if(hour != 12)
				hour += 12;
		}
		System.out.println("Time is: "+hour+":"+min+":"+sec);
	}
	
}
