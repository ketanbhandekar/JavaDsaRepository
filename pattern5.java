import java.io.*;
import java.lang.*;

class pattern5
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		for(row=4;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern5 obj=new pattern5();

		obj.pat();
	}
}

//												*
//												*  *
//												*  *  *
//												*  *  *  *
//												*  *  *  *  *
//												*  *  *  *
//												*  *  *
//												*  *
//												*


