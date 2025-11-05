/*
Write program to character from keyboard and check character is alphabet digit or special symbols?
*/
public class CheckCharacter
{
	public static void main(String x[])
	{
		char input = x[0].charAt(0);
		int ch = (int)input;
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
		{
			System.out.println("Alphabet");
		}
		else if(ch >= 48 && ch <= 57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special symbol");
		}
	}
}