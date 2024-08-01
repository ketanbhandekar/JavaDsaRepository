import java.io.*;
import java.lang.*;

class pattern2
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=1;row<=6;row++)
		{
			for(col=1;col<=6;col++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern2 obj=new pattern2();

		obj.pat();
	}
}

// 							*  *  *  *  *  *
//              					*  *  *  *  *  *
//							*  *  *  *  *  *
//							*  *  *  *  *  *
//							*  *  *  *  *  *
//							*  *  *  *  *  *
