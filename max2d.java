import java.io.*;
import java.lang.*;
import java.util.Arrays;

class max2d
{
	public void max()
	{
		int arr[][]={
					{23,44,55},
					{22,99,101},
					{1,6,9},
					};

		//Imagine that arr is not empty

		int max=arr[0][0];							//int max=0;				//(Starts From 0th Element OR
																				//Starts From 0th Row)

		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]>max)
				{
					max=arr[row][col];
				}
			}
		}
		System.out.println(Arrays.deepToString(arr));

		System.out.println("MAX: " +max);
	}
	public static void main(String args[])
	{
		max2d obj=new max2d();

		obj.max();
	}
}
