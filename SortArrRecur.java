import java.io.*;
import java.lang.*;

class SortArrRecur
{
	static int arr[]={1,2,3,4,5,8};

	static boolean sorted(int arr[],int index)
	{
		if(index==arr.length-1)
		{
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr,index+1);
	}
	public static void main(String args[])
	{
		SortArrRecur obj=new SortArrRecur();

		boolean ans=sorted(arr,0);

		System.out.println(ans);
	}
}