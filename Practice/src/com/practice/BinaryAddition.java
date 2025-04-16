package com.practice;

public class BinaryAddition {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1011";
		 int aVal = 0;int temp = 1;
	        for(int i=a.length()-1;i>=0;i--)
	        {
	            int val = Character.getNumericValue(a.charAt(i));
	            aVal += temp * val;
	            temp = temp+temp;
	        }
	        int bVal = 0;temp = 1;
	        for(int i=b.length()-1;i>=0;i--)
	        {
	            int val = Character.getNumericValue(b.charAt(i));
	            bVal += temp * val;
	            temp = temp+temp;
	        }
	        int resInt = aVal + bVal;
	        System.out.println(resInt);
	        temp=1;
	        while(temp<=resInt)
	        {
	        	if((temp+temp)>resInt)
	        		break;
	            temp = temp+temp;
	            System.out.println(temp+"-temp");
	        }
	        StringBuilder str = new StringBuilder();
	        while(temp>=1 && resInt>=0)
	        {
	            if(resInt>=temp)
	            {
	                str.append(1);
	                resInt = resInt-temp;
	            }
	            else
	            {
	                str.append(0);
	            }
	            temp = temp/2;
	        }
	        System.out.println(str);
	        
	        
	        
	        ///////////////////////////////////////////////////////////
	        ///														///
	        ///                                                     ///
	        ///////////////////////////////////////////////////////////
	        int resInt1 = Integer.parseInt(a,2)+Integer.parseInt(b,2);
	        String result = Integer.toBinaryString(resInt1);
	        System.out.println(result);
	       System.out.println(Math.sqrt(213213));
	 
	}

}
