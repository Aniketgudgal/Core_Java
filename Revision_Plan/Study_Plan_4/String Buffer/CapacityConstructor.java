public class CapacityConstructor
{
	public static void main(String x[])
	{
		StringBuffer sb = new StringBuffer(10);
		sb.append("Aniket Gudgal");
		StringBuffer a = new StringBuffer();
		System.out.println("capacity of a: "+a.capacity());
		System.out.println(sb);
		System.out.println(sb.capacity());
	}
}