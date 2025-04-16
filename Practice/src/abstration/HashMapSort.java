package abstration;

import java.util.HashMap;
import java.util.Map;

public class HashMapSort{
	public static HashMap<Integer, Integer> tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> obj = new HashMap<>();
        int res=0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int pro = nums[i]*nums[j];
//                if(obj.containsKey(pro))
//                {
//                    obj.put(pro,(obj.get(pro)+1));
//                }
//                else {
//                	obj.put(pro,1);
//                }
                obj.merge(pro, 1, Integer::sum);
            }
        }
//        for(Map.Entry<Integer, Integer> entry: obj.entrySet())
//        {
//            if(entry.getKey()>1)
//            {
//                res = res + ((entry.getValue()*(entry.getValue()-1))/2);
//            }
//        }
        return obj;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> obj = new HashMap<>();
		obj.put("samba",342);
		obj.put("sam",324);
		obj.put("ae", 3249);
		obj.put("ye", 96);
		obj.put("wew", 50);
		System.out.println(obj);
		int []nums = {1,2,4,5,10};
		System.out.println(tupleSameProduct(nums));
	}

}
