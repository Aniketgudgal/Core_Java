import java.io.File;
public class FileReader
{
	public static void main(String x[])
	{
		File f = new File("D:/");
		File f1[] = f.listFiles();
		for(int i = 0; i < f1.length; i++)
		{
			// read the all folder
			//System.out.println(f1[i]);
			
			// read the file only
			// to check the file or directory using the isFile() method or isDirectory()
			if(f1[i].isFile())
			{
				System.out.println(f1[i]);
			}
		}
	}
}