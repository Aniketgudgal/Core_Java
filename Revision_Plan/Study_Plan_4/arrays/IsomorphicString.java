/*
) Isomorphic Strings
Two strings are isomorphic if characters map one-to-one.
Example
Input: "egg", "add" → true
Input: "foo", "bar" → false
*/
import java.util.Scanner;
public class IsomorphicString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first String: ");
		String s1 = sc.nextLine()+" ";
		System.out.print("Enter the second String: ");
		String s2  = sc.nextLine()+ " ";
		if(s2.length() != s1.length())
		{
			System.out.println("The given String is not isomorphic");
		}
		else
		{
			s1 = encodingString(s1);
			s2 = encodingString(s2);
			if(s1.equals(s2))
			{
				System.out.println("The string is isomorphic");
			}
			else
			{
				System.out.println("not a isomorphic");
			}

		}
	}
	public static String encodingString(String s)
	{
		int[] map = new int[256];
        int next = 1;

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (map[c] == 0) {
                map[c] = next++;
            }

            result += map[c];
        }

        return result;
	}
}