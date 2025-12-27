package in.co.rays.collection.collection-list;

import java.util.List;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		for (char c = 'a'; c <= 'z'; c++) {
			s.push(c);

		}
		System.out.println(s);

		System.out.println(s.pop());		// pop method remove only one last element

		System.out.println(s);

		System.out.println(s.peek());		// Only print Last element but not remove

		System.out.println(s);

		while (!s.isEmpty()) {
			System.out.println(s.pop());

		}
		System.out.println(s);

	}
}