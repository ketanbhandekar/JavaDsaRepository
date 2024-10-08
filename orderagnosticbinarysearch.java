import java.io.*;
import java.lang.*;

class orderagnosticbinarysearch
{
	public void search()
	{
		int arr[]={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};

		int target=22;

		int start=0;

		int end=arr.length-1;

		boolean isAsc=arr[start]<arr[end];

		while(start<=end)
		{
			int mid=start+(end-start)/2;

			if(arr[mid]==target)
			{
				System.out.println("ANS FOUND: " +arr[mid]);

				return;
			}
			if(isAsc)
			{
				if(target<arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
			else
			{
				if(target>arr[mid])
				{
					end=mid-1;
				}
				else
				{
					start=mid+1;
				}
			}
		}
		System.out.println("NOT FOUND");
	}
	public static void main(String args[])
	{
		orderagnosticbinarysearch obj=new orderagnosticbinarysearch();

		obj.search();
	}
}