import java.io.*;
import java.lang.*;

class SortArrRecur
{
	static int arr[]={1,2,3,4,5,8};

	static boolean sorted(int arr[],int index)
	{
		if(index==arr.length-1)					//Base Case
		{
			return true;
		}
		return arr[index]<arr[index+1] && sorted(arr,index+1);		//This line compares the current element with the next element.
							//If the current element is less than the next one, it recursively checks the next pair of elements by calling the sorted method with the next index.
	}
	public static void main(String args[])
	{
		SortArrRecur obj=new SortArrRecur();

		boolean ans=sorted(arr,0);

		System.out.println(ans);
	}
}
