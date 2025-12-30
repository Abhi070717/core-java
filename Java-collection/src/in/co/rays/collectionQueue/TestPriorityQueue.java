package in.co.rays.collectionQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	public static void main(String[] args) {

		Queue q = new PriorityQueue();		//Print order in ascending order

		q.add('d');
		q.add('a');
		q.add('c');
		q.add('b');
		//q.add(4.5);

		System.out.println(q);

	}
}
