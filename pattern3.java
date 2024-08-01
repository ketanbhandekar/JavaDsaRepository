import java.io.*;
import java.lang.*;

class pattern3
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=5;row>=1;row--)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern3 obj=new pattern3();

		obj.pat();
	}
}

//					* * * * *
//					* * * *
//					* * *
//					* *
//					*
