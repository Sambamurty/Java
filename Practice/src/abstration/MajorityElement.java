package abstration;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] nums)
	{
		int n = nums.length/2;
		HashMap<Integer, Integer> counts = new HashMap<>();
		for(int i:nums)
		{
			counts.putIfAbsent(i, 0);
			counts.put(i,counts.get(i)+1);
			if(counts.get(i)>n)
			{
				return i;
			}
		}
		return -1;
		
	}
	public void rotate(int[] nums, int k) {
        int size = nums.length;
        k=k%size;
        while(k>0)
        {
            int last = nums[size-1];
            for(int i=size-1;i>0;i--)
            {
                nums[i]=nums[i-1];
            }
            nums[0]=last;
            k--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
		int[] nums = {7,1,2,1,4,1,1,5,1};
		MajorityElement obj = new MajorityElement();
		System.out.println(obj.majorityElement(nums));
		obj.rotate(nums, 2);
		System.out.println(Arrays.toString(nums));
	}

}
