import java.io.IOException;
import java.io.FileReader;
import java.io.File;
public class VowelsRead
{
	public static void main(String x[]) throws IOException
	{
		String path = "D:\\Tech Hub\\github core java\\File Handling\\Writing\\vowels.txt";
		File f = new File(path);
		FileReader fr = new FileReader(f);
		int data = 0;
		int count = 0;
		while(data != -1)
		{
			char ch = (char)data;
			if(ch >= 'A' && ch <= 'Z')
			{
				ch = (char)(ch + 32);
			}
			System.out.print(ch);
			if(ch == 'a' ||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
			data = fr.read();
		}
		System.out.println("\nThe Total values are: "+count);
	}
}