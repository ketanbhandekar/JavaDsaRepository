import java.io.*;
import java.lang.*;
import java.util.Arrays;

class max1	//Max Value From Array
{
	public void max()
	{
		int arr[]={1,20,3,4,5};

		//Imagine that arr is not empty
		int maxval=arr[0];		//int max=0;			//(Starts From 0th Element OR
										//Starts From 0th Row)
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxval)
			{
				maxval=arr[i];
			}
		}
		System.out.println("ARRAY: " +Arrays.toString(arr));
		System.out.println("MAX: "+ maxval);
	}
	public static void main(String args[])
	{
		max1 obj=new max1();

		obj.max();
	}
}
