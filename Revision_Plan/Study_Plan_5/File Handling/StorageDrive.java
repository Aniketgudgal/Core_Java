// check the drive storage
import java.io.File;
public class StorageDrive
{
	public static void main(String x[])
	{
		File[] f1 = File.listRoots();
		for(int i = 0; i < f1.length; i++)
		{
			System.out.println(f1[i]+" "+(f1[i].getTotalSpace()/1073741824)+": GB"+"\t Free space: "+(f1[i].getFreeSpace()/1073341824)+" GB");
		}
	}
}