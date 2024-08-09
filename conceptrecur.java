import java.io.*;
import java.lang.*;

class conceptrecur
{
	public void fun(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);

		fun(--n);
	}
	public static void main(String args[])
	{
		conceptrecur obj=new conceptrecur();

		obj.fun(5);
	}
}

													// 5 4 3 2 1