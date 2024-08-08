import java.io.*;
import java.lang.*;

class digitrecur
{
	static int digit(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return (n%10)+digit(n/10);
	}
	public static void main(String args[])
	{
		digitrecur obj=new digitrecur();

		int ans=digit(1234);

		System.out.println(ans);
	}
}