import java.io.*;
import java.lang.*;

class prodigitrecur
{
	static int prod(int n)
	{
		//The condition n % 10 == n checks if n is a single-digit number.

		if(n%10==n)//Gives Last Digit of n.					//If n = 7, then n % 10 equals 7, so n % 10 == n is true.
		{
			return n;
		}
		return (n%10)*prod(n/10);
	}
	public static void main(String args[])
	{
		prodigitrecur obj=new prodigitrecur();

		int ans=prod(1234);

		System.out.println(ans);
	}
}

