// create Folder using File class
import java.io.File;
public class CreateFolder
{
	public static void main(String x[])
	{
		File f1 = new File("D://Tech Hub/github core java/Revision_Plan/Study_Plan_5/File Handling/Demo");
		if(f1.exists())
		{
			System.out.println("Folder Already exits");
		}
		else 
		{
			boolean result = f1.mkdir();
			if(result)
			{
				System.out.println("Folder Created");
			}
			else
			{
				System.out.println("Not Created");
			}
		}
	}
}