package abstration;

public class ArrayCompare {
	public static <A extends Number> String compareArray(A[] arr1, A[] arr2)
	{
		if(arr1.length != arr2.length)
			return "false";
		
		for(int i=0;i<arr1.length;i++)
		{
			if(!arr1[i].equals(arr2[i]))
				return "false";
		}
		return "true";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {1,2,3,4};
		Integer arr1[] = {1,2,3,4};
		System.out.println(compareArray(arr,arr1));
	}

}
