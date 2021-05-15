import java.util.PriorityQueue;
public class Main
{
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(12);
		pq.add(14);
		pq.add(2);;
		pq.add(1);
		pq.add(18);
		pq.add(10);;
		
		System.out.println(pq+"     "+pq.peek());
	
		pq.remove();
			System.out.println(pq+"     "+pq.peek());
	}
}
