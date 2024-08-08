import java.io.*;
import java.lang.*;

class onetonrecur
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
	public static void main(String args[])
	{
		onetonrecur obj=new onetonrecur();

		obj.num(1);
	}
}
				// 1 2 3 4 5
