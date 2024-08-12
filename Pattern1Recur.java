import java.io.*;
import java.lang.*;

class Pattern1Recur
{
	static void pat(int r,int c)
	{
		if(r==0)
		{
			return;
		}
		if(c<r)
		{
			pat(r,c+1);
			System.out.print("* ");
		}
		else
		{
			pat(r-1,0);
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		Pattern1Recur obj=new Pattern1Recur();

		obj.pat(4,0);
	}
}
 