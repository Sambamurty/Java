package collection;

import java.awt.Toolkit;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracHashTable {
	public static int longestMonotonicSubarray(int[] nums) {
        int isubString = 0;
        int dsubString = 0;
        int l = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                isubString++;
                if(isubString>l)
                    l = isubString;
            }
            else
            {
            	System.out.println("isubString - "+isubString);
                
                isubString = 0;
            }
            if(nums[i]>nums[i+1])
            {
                dsubString++;
                if(dsubString > l)
                    l = dsubString;
            }
            else
            {
            	System.out.println("dsubString - "+dsubString);
                
                dsubString = 0;
            }
            //if(i == nums.length && )
           
            
        }
        return l+1;
    }
	
	
	public static int myAtoi(String s) {
        s = s.trim();
        System.out.println(s);
        int res = 0;int tem=0;
        for(int i=0;i<s.length();i++)
        {
        	if((i==0 && s.charAt(i)=='-'))
        	{
        		tem = -1;
        	}
        	else if(Character.isDigit(s.charAt(i)))
            {
                res = res*10+Character.getNumericValue(s.charAt(i));
                System.out.println(res);
            }
            else{
                break;
            }
        }
        if(tem == -1)
            return -1*res;
        return res;    
        
    }
	
	public static int maxArea(int[] height) {
        int f = 0;
        int b = height.length-1;
        int max=0;int flag=0;
        while(b>f)
        {
            int fv = height[f];
            int bv = height[b];
            if(fv<bv && max<fv*(b-f-1))
            {
                max = fv*(b-f);
            }
            else if(bv<fv && max<bv*(b-f-1))
            {
                max = bv*(b-f);
            }
            if(flag==0){  
                f++;
                flag=1;
            }
            else
            {
                b--;
                flag=0;
            }
            System.out.println(max);
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {4,4,1,2,3,4,5};
		int []height = 	{1,8,6,2,5,4,8,3,7};
//		HashMap<Integer,Integer> obj = new HashMap<>();
//		for(int i=0;i<nums.length;i++)
//        {
//            obj.putIfAbsent(nums[i],0);
//            obj.put(nums[i],obj.get(nums[i])+1);
//        }
//		//obj.containsValue(1);
//		System.out.println(obj);
//		for(Map.Entry<Integer, Integer> m:obj.entrySet())
//        {
//            if(m.getValue().equals(1))
//                System.out.println(m.getKey());
//        }
//		System.out.println(longestMonotonicSubarray(nums));
//		System.out.println(Character.getNumericValue('4'));
//		String s = "   -042";
//		System.out.println(myAtoi(s)+" "+Integer.MAX_VALUE);
		System.out.println(maxArea(height));
		
		
	}
}
