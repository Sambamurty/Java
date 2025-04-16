package patterns;

public class NumberSequenceUpDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		for(int i=1;i<=n;i++)
		{
			int temp = i;
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(i+" ");
				}
				else if(j%2==0)
				{
					System.out.print(((n-i)*2+1)+temp+" ");
					temp = ((n-i)*2+1)+temp;
				}
				else
				{
					System.out.print(2+(2*(i-j))+temp+" ");
					temp = (2+(2*(i-j)))+temp;
				}
			}
			System.out.println();
		}
		int count = (int) ((Math.log(n)/Math.log(10))+1);
		System.out.println(count);
	}

}
