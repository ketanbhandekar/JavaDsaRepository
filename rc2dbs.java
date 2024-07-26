import java.io.*;
import java.lang.*;

class rc2dbs
{
	public void search()
	{
		int arr[][]={
					{10,20,30,40},
					{15,25,35,45},
					{28,29,37,49},
					{33,34,38,50}
					};

		int target=37;

		int r=0;

		int c=arr.length-1;

		while(r<arr.length && c>=0)
		{
			if(arr[r][c]>target)
			{
				c--;
			}
			else if(arr[r][c]<target)
			{
				r++;
			}
			else
			{
				System.out.println("TARGET FOUND");

				return;
			}
		}
		System.out.println("TARGET NOT FOUND");
	}
	public static void main(String args[])
	{
		rc2dbs obj=new rc2dbs();

		obj.search();
	}
}