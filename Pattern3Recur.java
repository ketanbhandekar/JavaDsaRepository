import java.io.*;
import java.lang.*;

class Pattern3Recur
{
	static void pat(int r,int c)
	{
		if(r==0)
		{
			return;
		}
		if(c<r)
		{
			System.out.print("* ");
			pat(r,c+1);
		}
		else
		{
			System.out.println();
			pat(r-1,0);
		}
	}
	public static void main(String args[])
	{
		Pattern3Recur obj=new Pattern3Recur();

		obj.pat(4,0);
	}
}