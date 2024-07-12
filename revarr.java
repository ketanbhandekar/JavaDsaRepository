import java.io.*;
import java.lang.*;
import java.util.Arrays;

class revarr
{
	public void rev()
	{
		int arr[]={1,2,3,4,5};

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]); //Printing The Original Array
		}
		System.out.println("REVERSING THE ARRAY: ");

		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
	public static void main(String args[])
	{
		revarr obj=new revarr();

		obj.rev();
	}
}
