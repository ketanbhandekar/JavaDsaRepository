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
		int cnt=0;				//Initializes a counter variable cnt to zero, which will be used 
							//to count the number of divisors of the input number.

		for(int i=1;i<=no;i++)
		{
			if(no%i==0)			//Checks if no is divisible by i(i.e., the remainder when no is divided by i is zero)
			{
				cnt++;
			}
		}
		if(cnt==2)				//Checks if cnt is equal to 2, which would mean the number has exactly
							//two divisors (1 and itself), indicating it is a prime number.
		{
			System.out.println("PRIME NUMBER");
		}
		else
		{
			System.out.println("NOT A PRIME NUMBER");
		}
	}
}
