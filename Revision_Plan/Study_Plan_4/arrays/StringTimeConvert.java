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
		StringBuffer duration = new StringBuffer();
		int count = 0;
		StringBuffer rev = new StringBuffer();
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) != ':')
			{
				if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
				{
					rev.append(s.charAt(i));
				}
				else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				{
					duration.append(s.charAt(i));
				}
			}
			else
			{
				count++;
				if(count == 1)
				{
					hour = Integer.parseInt(rev.toString());
					rev.setLength(0);
				}
				else if(count == 2)
				{
					min = Integer.parseInt(rev.toString());
					rev.setLength(0);
				}
				else
				{
					sec = Integer.parseInt(rev.toString());
				}
			}
		}
		/*
		// 11:30:00AM 
		"11:30:00AM" -> "11:30:00"
		"11:30:00PM" -> "23:30:00"
		*/
		if(duration.toString().equals("AM"))
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
