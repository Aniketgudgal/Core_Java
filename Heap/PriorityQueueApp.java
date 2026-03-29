import java.util.PriorityQueue;
public class PriorityQueueApp
{
	public static void main(String x[])
	{
		PriorityQueue<Integer> s = new PriorityQueue<>();
		s.add(10);
		s.add(30);
		s.add(80);
		s.add(20);
		s.add(100);
		s.add(5);
		System.out.println(s.poll());
		System.out.println(s);
		System.out.println(s.remove());
		System.out.println(s);
	}
}