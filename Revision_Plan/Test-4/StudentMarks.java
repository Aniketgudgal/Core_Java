/*
Store student names and marks of 3 subjects using arrays.
Calculate:
• Total
• Percentage
Explanation
1. Store names and marks in arrays.
2. Calculate total.
3. Find percentage.
4. Map student name with marks.
Input:
Students: ["Amit","Riya","Kunal"]
Java: [70,80,90]
SQL: [75,85,95]
Python: [65,88,92]
Output:
Amit -> Total:210 Percentage:70
Riya -> Total:253 Percentage:84
Kunal -> Total:277 Percentage:92
*/
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class StudentMarks
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of student: ");
		int size = sc.nextInt();
		String[] names = new String[size];
		int[] java = new int[size];
		int[] SQL  = new int[size];
		int[] python = new int[size];
		for(int i = 0; i < names.length; i++)
		{
			System.out.print("Enter the name of "+ (i+1)+" Student: ");
			names[i] = sc.next();
			System.out.print("Enter the java marks: ");
			java[i] = sc.nextInt();
			System.out.print("Enter the SQL marks: ");
			SQL[i] = sc.nextInt();
			System.out.print("Enter the python marks: ");
			python[i] = sc.nextInt();
		}
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
		for(int i = 0; i < names.length; i++)
		{
			int totalMarks = java[i]+SQL[i]+python[i];
			hm.put(names[i],totalMarks);
		}
		percentage(hm,3);
	}
	public static void percentage(LinkedHashMap<String, Integer> hm, int totalSubject)
	{
		for(Map.Entry<String, Integer> m: hm.entrySet())
		{
			System.out.println(m.getKey()+" total marks: "+m.getValue()+" Percentage: "+(m.getValue()/totalSubject));
		}
	}
}