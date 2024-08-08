import java.io.*;
import java.lang.*;

class sumrecur
{
	static int sum(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		return (n+sum(n-1));
	}
	public static void main(String args[])
	{
		sumrecur obj=new sumrecur();

		int ans=sum(5);

		System.out.println(ans);
	}
}

