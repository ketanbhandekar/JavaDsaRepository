import java.io.*;
import java.lang.*;

class evend									//even digit
{
	public void find()
	{
		int arr[]={12,345,2,6};

		int cnt=0;

		int ans=0;							//to Store the numbers in an Array

		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]>0)
			{
				cnt++;						//counting the digits

				arr[i]=arr[i]/10;			//reducing the digits
			}
			if(cnt%2==0)
			{
				ans++;						//stores even numbers in an array
			}
		}
		System.out.println(ans);
	}
	public static void main(String args[])
	{
		evend obj=new evend();

		obj.find();
	}
}
