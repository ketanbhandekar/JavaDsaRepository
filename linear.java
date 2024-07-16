import java.io.*;
import java.lang.*;

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

//The error in your code is that the loop will only iterate once due to the return statements inside the loop. 
//Specifically, the return 0 statement within the else block will terminate the search method during the first 
//iteration if the target element is not found. This prevents the loop from checking the rest of the elements in the array.

//To fix this, you should move the return 0 statement outside the loop so that it only returns 0 after the 
//loop has been completed and the target element has not been found. Additionally, you should remove the
//"TARGET ELEMENT NOT FOUND" message from the loop and print it only if the target element is not found after 
//the loop finishes.



// WITHOUT ELEMENT VARIALBE.....

import java.io.*;
import java.lang.*;

class linear 								//Normal Linear Searching With Target Value
{
	public int search()						//public boolean search()
	{
		int arr[]={23,45,1,2,8,19,-3,16,-11,28};

		int target=19;

		for(int index=0;index<arr.length;index++)
		{
			//int element=arr[index];

			if(arr[index]==target)
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
