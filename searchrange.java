import java.io.*;
import java.lang.*;

class searchrange
{
	public int search()
	{
		int arr[]={18,12,-7,3,14,28};

		int target=-7;

		int start=0;

		int end=5;

		for(int i=start;i<=end;i++)
		{
			if(arr[i]==target)
			{
				System.out.println("TARGET ELEMENT FOUND AT INDEX: " +i);

				return 1;
			}
		}
		System.out.println("TARGET ELEMENT NOT FOUND");

		return 0;
	}
	public static void main(String args[])
	{
		searchrange obj=new searchrange();

		obj.search();
	}
}