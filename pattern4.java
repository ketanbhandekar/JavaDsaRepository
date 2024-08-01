import java.io.*;
import java.lang.*;

class pattern4
{
	public void pat()
	{
		int row=0;
		int col=0;

		for(row=1;row<=5;row++)
		{
			for(col=1;col<=row;col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		pattern4 obj=new pattern4();

		obj.pat();
	}
}

//			1
//			12
//			123
//			1234
//			12345


