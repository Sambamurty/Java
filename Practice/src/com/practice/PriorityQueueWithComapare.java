package com.practice;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;



public class PriorityQueueWithComapare {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> comparator = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                } else {
                    return 0;
                }
			}
			
		};
		Queue<Integer> pq = new PriorityQueue<>(comparator);
		pq.addAll(List.of(1,23,43,53,65,23,534,21,4));
		System.out.println(pq);
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
	}

}
