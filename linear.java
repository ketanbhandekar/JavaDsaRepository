import java.io.*;
import java.lang.*;
import java.util.Arrays;

class linear 								//Normal Linear Searching With Target Value
{
	public int search()						//public boolean search()
	{
		int arr[]={23,45,1,2,8,19,-3,16,-11,28};

		int target=19;

		for(int index=0;index<arr.length;index++)
		{
			int element=arr[index];

			if(element==target)
			{
				System.out.println("TARGET ELEMENT FOUND AT INDEX: " +index);

				return 1;  				//return true;		//return index;
			}
		}
		System.out.println("TARGET ELEMENT NOT FOUND");	
				
		return 0;						//return false;  	//return -1;
	}										
	public static void main(String args[])
	{
		linear obj=new linear();

		obj.search();
	}
}


