import java.io.*;
import java.lang.*;

class binarysearch
{
	public void search()
	{
		int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};

		int target=22;

		int start=0;

		int end=arr.length-1;

		while(start<=end)			//for(int i=start;i<=arr.length-1;i++)
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
		System.out.println("TARGET NOT FOUND");
	}
	public static void main(String args[])
	{
		binarysearch obj=new binarysearch();

		obj.search();
	}
}

