package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,6,10,6};
		if(nums.length == 1)
        {
			System.out.println(nums[0]);
        }
		else {
        HashMap<Integer,TreeSet<Integer>> obj = new HashMap<>();
        int maxSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            int s = 0;
            int temp = nums[i];
            while(temp>0)
            {
                s = s + temp%10;
                temp = temp/10;
            }
            //System.out.println(s);
            if(!obj.containsKey(s))
            {
                TreeSet<Integer> ts= new TreeSet<>();
                ts.add(nums[i]);
                obj.put(s,ts);
                System.out.println(obj);
            }
            else{
            	TreeSet<Integer> ts = obj.get(s);
                ts.add(nums[i]);

                // Keep only the two largest numbers in the TreeSet
                while (ts.size() > 2) {
                    ts.remove(ts.first()); // Remove the smallest element
                }

                // Recalculate maxSum based on all pairs in the TreeSet for this digitSum
                if (ts.size() == 2 || (ts.size()==1 && ts.getFirst() == nums[i])) {
                    int currentSum = ts.first() + ts.last(); // Use long to prevent overflow
                    maxSum = Math.max(maxSum, currentSum);
                }
                System.out.println(obj);
            }
            
        }
        System.out.println(maxSum);
		}   
	}

}
