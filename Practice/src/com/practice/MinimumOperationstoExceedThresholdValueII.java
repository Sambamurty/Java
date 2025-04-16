package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumOperationstoExceedThresholdValueII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,19,23};
		int k=4;
//		Arrays.sort(nums);
//        int c = 0;
//        for(int i=0;i<nums.length-1;)
//        {
//            if(nums[i] >= k)
//            {
//                break;
//            }
//            long x = nums[i];
//            long y = nums[i+1];
//            long value = Math.min(x,y)*2+Math.max(x,y);
//        
//            nums[i] = k;
//            if(value>Integer.MAX_VALUE)
//            	nums[i+1] = Integer.MAX_VALUE;
//            else
//            	nums[i+1] = (int)value;
//            System.out.println(Arrays.toString(nums)+" "+value);
//            i++;
//            if(nums[i] >= k)
//                i++;
//            c++;
//            if(i==nums.length-1 && nums[i]<k)
//            {c++;}
//        }
//		System.out.println(c);
		PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer((long) num);
        }

        int operations = 0;
        while (pq.size() >= 2 && pq.peek() < k) {
            long x = pq.poll();
            long y = pq.poll();
            //System.out.println(x+" "+y);
            long newValue = Math.min(x, y) * 2 + Math.max(x, y);
            pq.offer(newValue);
            operations++;
            //System.out.println(pq);
        }
        System.out.println(operations);
	}

}
