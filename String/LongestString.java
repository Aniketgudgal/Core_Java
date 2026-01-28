public class LongestString
{
	public static void main(String x[])
	{
		String[] strs = new String[]{"flower","flow","flight"};
		String s = "";
		String prefix = strs[0];
		System.out.println("prefix: "+prefix);
		for(int i = 1; i < strs.length; i++)
		{
			while(strs[i].indexOf(prefix) != 0)
			{
				
				System.out.println("IndexOf: "+strs[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println("prefix: "+prefix);
				System.out.println("substring: "+prefix.substring(0, prefix.length() - 1));
				System.out.println("isEmpty: "+prefix.isEmpty());
				if(prefix.isEmpty())
				{
					System.out.println(" ");
				}
			}
		}
		System.out.println(prefix);
	}
}