import java.io.*;
import java.lang.*;

class wealth
{
	public void money()
	{
		int accounts [][]=	{
					   {1,2,3},
					   {3,2,2},
				  	 };
		int ans=0;

		for(int person=0;person<accounts.length;person++)
		{
			int sum=0;

			for(int account=0;account<accounts[person].length;account++)
			{
				sum=sum+accounts[person][account];
			}
			if(sum>ans)
			{
				ans=sum;
			}
		}
		System.out.println("ANSWER IS : "+ans);
	}
	public static void main(String args[])
	{
		wealth obj=new wealth();

		obj.money();
	}
}
