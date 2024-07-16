import java.io.*;
import java.lang.*;

class searchs 								//Search In String
{
	public boolean search()
	{
		String str="KB";
		char target='B';

		if(str.length()==0)
		{
			return false;
		}

		for(int i=0;i<str.length();i++)
		{
			if(target==str.charAt(i))
			{
				System.out.println("TARGET FOUND");

				return true;
			}
		}
		System.out.println("TARGET NOT FOUND");

		return false;
	}
	public static void main(String args[])
	{
		searchs obj=new searchs();

		obj.search();
	}
}
