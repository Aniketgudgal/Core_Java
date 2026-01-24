import java.io.File;
public class ReadDrive
{
	public static void main(String x[])
	{
		File fe[] = File.listRoots();
		for(int i = 0; i < fe.length; i++)
		{
			long total = fe[i].getTotalSpace();
			long free = fe[i].getFreeSpace();
			System.out.println(fe[i]+" Total Space is: "+total/1073741824+" GB\tFree Space is: "+free/1073741824+" GB");
		}
	}
}