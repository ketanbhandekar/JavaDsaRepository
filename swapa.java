import java.io.*;
import java.lang.*;
import java.util.Arrays;

class swapa //Swap Values in an Array
{
	static void swap(int arr[],int index1, int index2)
	{
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
	public static void main(String args[])
	{
		int[]arr={1,2,3,4,5};
		swap(arr,1,3);

		System.out.println(Arrays.toString(arr));
	}
}


// import java.io.*;
// import java.lang.*;
// import java.util.Arrays;

// class swapa //Swap Values in an Array
// {
// 	static void swap()
// 	{
// 		int arr[]={1,2,3,4,5};

// 		int temp;

// 		int index1=2;
// 		int index2=3;

// 		temp=arr[index1];
// 		arr[index1]=arr[index2];
// 		arr[index2]=temp;

// 		System.out.println(Arrays.toString(arr));
// 	}
// 	public static void main(String args[])
// 	{
// 		swapa obj=new swapa();

// 		obj.swap();
// 	}
// }
