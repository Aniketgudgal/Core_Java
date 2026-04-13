import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class ReadData
{
	public static void main(String x[]) throws IOException
	{
		String path = "D:\\Tech Hub\\github core java\\File Handling\\Writing\\abc123.txt";
		FileReader fr = new FileReader(path);
		int data = fr.read();
		while(data != -1)
		{
			System.out.print((char)data);
			data  = fr.read();
		}
	}
}