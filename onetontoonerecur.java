import java.io.*;
import java.lang.*;

class onetontoonerecur
{
	public void num(int n)
	{
		if(n==6)
		{
			return;
		}
		System.out.println(n);

		num(n+1);
	}
	public void num1(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);

		num1(n-1);
	}
	public static void main(String args[])
	{
		onetontoonerecur obj=new onetontoonerecur();

		obj.num(1);

		obj.num1(5);
	}
}