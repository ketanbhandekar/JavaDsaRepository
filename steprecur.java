import java.io.*;
import java.lang.*;

class steprecur
{
	static int step(int n)
	{
		return helper(n,0);
	}
	static int helper(int n,int steps)
	{
		if(n==0)
		{
			return steps;
		}
		if(n%2==0)
		{
			return helper(n/2,steps+1);
		}
		else
		{
			return helper(n-1,steps+1);
		}
	}
	public static void main(String args[])
	{
		steprecur obj=new steprecur();

		System.out.println(step(41));
	}
}
