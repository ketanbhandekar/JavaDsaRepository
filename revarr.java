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

	//WITH 2 POINTER METHOD
// import java.io.*;
// import java.lang.*;
// import java.util.Arrays;

// class revarray //Swap Values in an Array
// {
// 	static void swap(int arr[],int index1, int index2)
// 	{
// 		int temp=arr[index1];
// 		arr[index1]=arr[index2];
// 		arr[index2]=temp;
// 	}
// 	static void reverse(int arr[])
// 	{
// 		int start=0;
// 		int end=arr.length-1;

// 		while(start<end)
// 		{
// 			swap(arr,start,end);
// 			start++;
// 			end--;
// 		}
// 	}
// 	public static void main(String args[])
// 	{
// 		int[]arr={1,2,3,4,5};
// 		//swap(arr,0,4);
// 		reverse(arr);

// 		System.out.println(Arrays.toString(arr));
// 	}
// }
