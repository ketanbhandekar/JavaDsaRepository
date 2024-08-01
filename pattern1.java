import java.io.*;
import java.lang.*;

class pattern1
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=1;row<=4;row++)
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
		pattern1 obj=new pattern1();

		obj.pat();
	}
}


//					*
//					* *
//					* * *
//					* * * *
