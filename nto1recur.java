import java.io.*;
import java.lang.*;

class nto1recur
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
		nto1recur obj=new nto1recur();

		obj.num(10);
	}
}

