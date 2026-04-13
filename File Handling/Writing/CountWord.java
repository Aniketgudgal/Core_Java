import java.io.IOException;
import java.io.FileReader;
public class CountWord
{
	public static void main(String args[]) throws IOException
	{
		String path = "D:\\Tech Hub\\github core java\\File Handling\\Writing\\abc123.txt";
		FileReader f = new FileReader(path);
		int data = f.read();
		int count = 0;
		while(data != -1)
		{
			char ch = (char)data;
			System.out.print(ch);
			if(ch == ' ')
			{
				count++;
			}
			data = f.read();
		}
		if (count > 0) {
            count = count + 1;
        }
		System.out.println("Total Count is: "+count);
	}
}
