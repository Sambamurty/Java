package abstration;

import java.util.Arrays;

public class removeDuplicates {
	public static int removeDuplicate(int[] nums) {
        int idx=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[idx]=nums[i+1];
                idx++;
            }
        }
        return idx;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicate(nums));
	}

}
