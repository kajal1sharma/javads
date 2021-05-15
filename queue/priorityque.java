import java.util.Comparator;
import java.util.PriorityQueue;
public class priorityque implements Comparator<Integer>
{
    @Override
    public int compare(Integer a,Integer b){
        return b-a;
    }
	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new priorityque());
		
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
