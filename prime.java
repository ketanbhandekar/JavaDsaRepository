//a number that can only be divided by itself and 1 without remainder
	
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


   
import java.io.*;
import java.lang.*;
import java.util.Scanner;

class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int no=sc.nextInt();
		int cnt=0;

		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				cnt++;
			}
		}
		if(cnt==2)
		{
			System.out.println("PRIME NUMBER");
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER");
		}
	}
}
