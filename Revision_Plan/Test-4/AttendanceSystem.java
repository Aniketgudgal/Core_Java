/*
 Store attendance records using String array.
Find:
1. Present count of each student
2. Highest attendance
3. Total absent count
Explanation
• Split string using "-"
• Store present count in Map
• Count absents separately
Input :
Rahul-Present
Amit-Absent
Rahul-Present
Neha-Present
Amit-Present
Output :
Rahul -> 2
Amit -> 1
Neha -> 1
Total Absent : 1
Highest Attendance : Rahul
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class AttendanceSystem
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the data of student: ");
		String data = sc.nextLine();
		String[] attendance = data.split("-");
		HashMap<String, ArrayList<Boolean>> attend = new HashMap<>();
		for(int i = 0; i < attendance.length - 1; i++)
		{
			if(!attend.containsKey(attendance[i]))
			{	
				ArrayList<Boolean> al = new ArrayList<>();
				if(attendance[i+1].equals("Present"))
				{
					al.add(true);
				}
				else
				{
					al.add(false);
				}
				attend.put(attendance[i],al);
				i++;
			}
			else
			{
				ArrayList<Boolean> al = attend.get(attendance[i]);
				if(attendance[i+1].equals("Present"))
				{
					al.add(true);
				}
				else
				{
					al.add(false);
				}
				attend.put(attendance[i],al);
				i++;
			}
		}
		attendStudent(attend);
		highestAttendance(attend);
		totalAbsent(attend);
	}
	public static void attendStudent(HashMap<String, ArrayList<Boolean>> hm)
	{
		for(Map.Entry<String, ArrayList<Boolean>> mp: hm.entrySet())
		{
			int present = 0;
			for(Boolean b: mp.getValue())
			{
				if(b == true)
				{
					present++;
				}
			}
			System.out.println(mp.getKey()+"->"+present);
		}
	}
	public static void highestAttendance(HashMap<String, ArrayList<Boolean>> hm)
	{
		String name = "";
		int max = 0;
		for(Map.Entry<String, ArrayList<Boolean>> mp: hm.entrySet())
		{
			int present = 0;
			for(Boolean b: mp.getValue())
			{
				if(b == true)
				{
					present++;
				}
			}
			if(present > max)
			{
				name = mp.getKey();
				max = present;
			}
		}
		System.out.println("Highest Attendance is: "+name);
	}
	public static void totalAbsent(HashMap<String, ArrayList<Boolean>> hm)
	{
		int absent = 0;
		for(Map.Entry<String, ArrayList<Boolean>> mp: hm.entrySet())
		{
			for(Boolean b: mp.getValue())
			{
				if(b == false)
				{
					absent++;
				}
			}
		}
		System.out.println("total Absent are: "+absent);
	}
}
