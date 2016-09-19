package testing;
//Store and return 4 elements in a queue
import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
	public static Object[] queue (int elements[]){
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<elements.length;i++){
			q.add(Integer.valueOf(elements[i]));
			
		}
		
		return q.toArray();
		
	}

}

