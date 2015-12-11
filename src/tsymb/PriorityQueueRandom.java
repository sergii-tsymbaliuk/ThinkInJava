package tsymb;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

class NewObject extends Object{
	
}

public class PriorityQueueRandom {
	public static void main(String[] args) {
		Queue<Double> q = new PriorityQueue<Double>();
		
		Random r = new Random (50);
		for (int i=0; i<10;i++)
			q.offer(r.nextDouble());
		
		while(q.size() >0)
			System.out.println(q.poll());


		Queue<Object> q2 = new PriorityQueue<Object>();
		
		for (int i=0;i<5;i++)
			q2.offer(new Object()); 
		
	}

}
