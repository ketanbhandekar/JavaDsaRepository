import java.io.*;
import java.lang.*;
import java.util.Arrays;

class max1
{
	public void max()
	{
		int arr[]={1,20,3,4,5};

		int maxval=arr[0];

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
