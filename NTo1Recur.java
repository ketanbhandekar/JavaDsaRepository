import java.io.*;
import java.lang.*;

class NTo1Recur
{
	public void num(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);

		num(n-1);
	}
	public static void main(String args[])
	{
		NTo1Recur obj=new NTo1Recur();

		obj.num(5);
	}
}
		// 5 4 3 2 1 
