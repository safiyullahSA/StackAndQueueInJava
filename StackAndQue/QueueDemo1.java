package StackAndQue;

import java.util.PriorityQueue;
import java.util.Queue;


public class QueueDemo1 {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<String>();
		queue.add("Im a don");
		queue.add("Ja");
		queue.add("Ka");
		System.out.println("Head - "+queue.element());
		System.out.println("Head - "+queue.peek());
		queue.poll();
		queue.remove();
		System.out.println(queue);
}
}