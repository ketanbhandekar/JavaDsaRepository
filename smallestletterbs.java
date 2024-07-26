import java.io.*;						//smallest letter greater then the target
import java.lang.*;						//we're not finding char is equal to the target ,
										//we're finding smallerst char greater then target
class smallestletterbs
{
	public void search()
	{
		char letters[]={'c','f','j'};

		char target='a';

		int start=0;

		int end=letters.length-1;

		while(start<=end)
		{
			int mid=start+(end-start)/2;

			if(target<letters[mid])
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
		}
		System.out.println(letters[start % letters.length]);
	}
	public static void main(String args[])
	{
		smallestletterbs obj=new smallestletterbs();

		obj.search();
	}
}
