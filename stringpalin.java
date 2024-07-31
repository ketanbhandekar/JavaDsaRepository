import java.io.*;
import java.lang.*;

class stringpalin
{
	public void pal()
	{
		String str="abcdcba";

		str=str.toLowerCase();

		for(int i=0;i<str.length()/2;i++)						//Divides The Array Till The First Part (Repeated) Part Of Array.
		{
			char start=str.charAt(i);

			char end=str.charAt(str.length()-1-i);				//start=mid+1 //end=mid-1

			if(start!=end)
			{
				System.out.println("LOOP IS VIOLATED");

				return;
			}
		}
		System.out.println("Given String Is Palindrome");

		return;
	}
	public static void main(String args[])
	{
		stringpalin obj=new stringpalin();

		obj.pal();
	}
}

