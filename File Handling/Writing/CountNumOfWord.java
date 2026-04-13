import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
public class CountNumOfWord
{
	public static void main(String x[]) throws IOException
	{
		String path = "D:\\Tech Hub\\github core java\\File Handling\\Writing\\abc123.txt";
		FileReader f = new FileReader(path);
		BufferedReader bf = new BufferedReader(f);
		String line = "";
		int count = -1;
		while(line != null)
		{
			String [] s = line.trim().split("\\s+");
			count += s.length;
			System.out.println(line);
			line = bf.readLine();
		}
		System.out.println("Word Count is: "+count);
	}
}