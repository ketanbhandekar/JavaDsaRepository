import java.io.*;
import java.lang.*;
import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER A NUMBER TO CHECK: ");
		int no=sc.nextInt();

		boolean ans=isPrime(no);

		System.out.println(isPrime(no));
	}
	static boolean isPrime(int no)
	{
		if(no<=1)
		{
			return false;
		}
		int c=2;

		while(c*c<=no)
		{
			if(no%c==0)
			{
				return false;
			}
			c++;
		}
		return c*c >no;
	}
}

