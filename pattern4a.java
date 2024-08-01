import java.io.*;
import java.lang.*;

class pattern4a
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern4a obj=new pattern4a();

		obj.pat();
	}
}

//					1
//					22
//					333
//					4444
//					55555







