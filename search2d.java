import java.io.*;
import java.lang.*;

class search2d
{
	public boolean search()
	{
		int arr[][]={
					{23,55,66},
					{62,92,43},
					{12,54,61},
					};

		int target=92;

		for(int row=0;row<=arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(arr[row][col]==target)
				{
					System.out.println("TARGET FOUND");

					return true;
				}
			}
		}
		System.out.println("TARGET NOT FOUND");

		return false;
	}
	public static void main(String args[])
	{
		search2d obj=new search2d();

		obj.search();
	}
}