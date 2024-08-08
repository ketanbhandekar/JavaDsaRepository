import java.io.*;
import java.lang.*;

class OneToNrecur
{
	public void num(int n)
	{
		if(n==6)				//if(n==0)
		{
			return;
		}
		System.out.println(n);			//num(n-1)

		num(n+1);				//System.out.println(n);
	}
	public static void main(String args[])
	{
		OneToNrecur obj=new OneToNrecur();

		obj.num(1);
	}
}
				// 1 2 3 4 5
