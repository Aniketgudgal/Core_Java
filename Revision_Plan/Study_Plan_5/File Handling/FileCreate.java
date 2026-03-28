// create file using File class 
import java.io.File;
import java.io.IOException;
public class FileCreate
{
	public static void main(String x[]) throws IOException
	{
		File f1 = new File("D:\\Tech Hub\\github core java\\Revision_Plan\\Study_Plan_5\\File Handling/abc.txt");
		if(!f1.exists())
		{
			boolean result = f1.createNewFile();
			if(result)
			{
				System.out.println("File Created");
			}
			else
			{
				System.out.println("not created");
			}
		}
		else
		{
			System.out.println("File Already exits");
		}
	}
}