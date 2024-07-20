import java.io.*;
import java.lang.*;

class ceilingbs
{
	//return the index of smallest no >= target
	public void search()
	{
		int arr[]={2,3,5,9,14,16,18};

		int target=15;

		int start=0;

		int end=arr.length-1;

		while(start<=end)
		{
			int mid=start+(end-start)/2;

			if(target>arr[mid])
			{
				start=mid+1;
			}
			else if(target<arr[mid])
			{
				end=mid-1;
			}
			else
			{
				System.out.println("TARGET FOUND: " +arr[mid]);

				return;
			}
		}
		System.out.println(arr[start]);
	}
	public static void main(String args[])
	{
		ceilingbs obj=new ceilingbs();

		obj.search();
	}
}

