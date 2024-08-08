import java.io.*;
import java.lang.*;

class OneToNrecur
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
		OneToNrecur obj=new OneToNrecur();

		obj.num(1);
	}
}
				// 1 2 3 4 5
