package abstration;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class Queue{
	
	    public static void main(String[] args) {
	  
	        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

	        // Adding elements to the priority queue
	        priorityQueue.add(4);
	        priorityQueue.add(2);
	        priorityQueue.add(1);
	        priorityQueue.add(3);
	        // Displaying the priority queue
	        System.out.println("Priority Queue: " + priorityQueue);

	        // Removing elements from the priority queue
	        int removed = priorityQueue.poll();
	        System.out.println("Removed element: " + removed);

	        // Displaying the priority queue after removal
	        System.out.println("Priority Queue after removal: " + priorityQueue);

	        // Peeking at the first element of the priority queue
	        int head = priorityQueue.peek();
	        System.out.println("Head of the priority queue: " + head);
	        
	        // 
	        Deque<Integer> dq = new ArrayDeque<>();
	        dq.addFirst(12);
	        dq.addFirst(234);
	        dq.addFirst(34);
	        dq.addFirst(43);
	        dq.add(23);
	        dq.addLast(823);
	        dq.add(12);
	        dq.removeFirstOccurrence(12);
	        //dq.removeLast();
	        System.out.println(dq);
	    }
	}


