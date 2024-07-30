import java.io.*;
import java.lang.*;
import java.util.Arrays;

class cycle
{
	public void c()
	{
		int arr[]={3,5,2,1,4};

		for(int i=0;i<arr.length;i++)
		{
			//VERY IMPORTANT LINE FOR CYCLIC SORT.

			while(arr[i]!= i+1) 	//(assuming the array contains elements from 1 to n).
			{
				int correct=arr[i]-1;				//Index=value-1;

				int temp=arr[i];
				arr[i]=arr[correct];
				arr[correct]=temp;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[])
	{
		cycle obj=new cycle();

		obj.c();
	}
}


//Consider the array {3, 5, 2, 1, 4}:

//Starting with index 0 (i = 0):
//arr[0] = 3 which should be at index 2 (3 - 1).
//Swap arr[0] with arr[2] resulting in {2, 5, 3, 1, 4}.
//arr[0] = 2 which should be at index 1 (2 - 1).
//Swap arr[0] with arr[1] resulting in {5, 2, 3, 1, 4}.
//arr[0] = 5 which should be at index 4 (5 - 1).
//Swap arr[0] with arr[4] resulting in {4, 2, 3, 1, 5}.
//arr[0] = 4 which should be at index 3 (4 - 1).
//Swap arr[0] with arr[3] resulting in {1, 2, 3, 4, 5}.
//Now arr[0] = 1 which is equal to 0 + 1.
//Move to index 1 (i = 1), arr[1] = 2 which is equal to 1 + 1, so no swaps needed.
//Continue this process for the rest of the array.