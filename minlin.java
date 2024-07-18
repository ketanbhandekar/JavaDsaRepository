import java.io.*;
import java.lang.*;

class minlin
{
	public void search()
	{
		int arr[]={1,9,3,22,4};

		//Imagine that arr is not empty					//(Starts From 0th Element OR
										//Starts From 0th Row)
		int min=arr[0];

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("MINIMUM ELEMENT FROM THE ARRAY: " +min);
	}
	public static void main(String args[])
	{
		minlin obj=new minlin();

		obj.search();
	}
}
