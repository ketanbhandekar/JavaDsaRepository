import java.io.*;
import java.lang.*;

class factrecur
{
	static int fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return (n*fact(n-1));
	}
	public static void main(String args[])
	{
		factrecur obj=new factrecur();

		int ans=fact(5);

		System.out.println(ans);
	}
}