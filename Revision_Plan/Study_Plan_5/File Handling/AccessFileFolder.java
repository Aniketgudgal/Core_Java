// fetch all the file and folder
import java.io.File;
public class AccessFileFolder
{
	public static void main(String x[])
	{
		File f1 = new File("D://Tech Hub/github core java/Revision_Plan/Study_Plan_5/File Handling");
		File list[] = f1.listFiles();
		for(File f : list)
		{
			System.out.println(f);
		}
	}
}