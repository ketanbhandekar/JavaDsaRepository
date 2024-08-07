import java.io.*;
import java.lang.*;

class binaryrecursion
{
	static int arr[]={98,24,63,45};
	static int target=63;

	static int search(int arr[],int target,int start,int end)
	{
		int mid=start+(end-start)/2;

		if(target>arr[mid])						//START CONDITION
		{
			return search(arr,target,mid+1,end);
		}
		else if(target<arr[mid])
		{
			return search(arr,target,start,mid-1);			//END CONDITION
		}
		else
		{
			return mid;
		}
	}
	public static void main(String args[])
	{
		binaryrecursion obj=new binaryrecursion();

		System.out.println(search(arr,target,0,arr.length-1));
	}
}
