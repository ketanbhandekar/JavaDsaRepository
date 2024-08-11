import java.io.*;
import java.lang.*;

class LinearRecur
{
	static int arr[]={1,4,7,9,11};

	static int target=9;

	static int search(int arr[],int target,int index)
	{
		if(index==arr.length-1)				//Traversing The Array
		{
			return -1;
		}
		if(arr[index]==target)
		{
			return index;
		}
		else
		{
			return search(arr,target,index+1);
		}
	}
	public static void main(String args[])
	{
		LinearRecur obj=new LinearRecur();

		System.out.println(search(arr,target,0));
	}
}
