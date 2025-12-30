package in.co.rays.collectionQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestArrayDeque {
	public static void main(String[] args) {

		Queue q = new ArrayDeque();

		q.offer("Ram");
		q.offer("Ram");
		q.offer("Rawan");
		q.offer(2);
		q.offer(4.5);

		System.out.println(q);
		System.out.println("q is remove Rawan: " + q.poll());	//Poll removes an element
		System.out.println(q);

	}
}