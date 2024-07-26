import java.io.*;
import java.lang.*;
import java.util.Arrays;

class bubble
{															//ALSO KNOWN AS SINKING & EXCHANGE SORT.
	public void bubble()
	{
		int arr[]={-1,7,-32,0,89};							//Compairing adjacent elements at every-step.

		for(int i=0;i<arr.length;i++)		//first for loop (outer for loop) is used to traverse the array n times.
		{		// i is counter only.
			for(int j=1;j<arr.length-1;j++)	//The Second for loop (inner for loop) is used to traverse the array and swap elements if necessary
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String args[])
	{
		bubble obj=new bubble();

		obj.bubble();
	}
}