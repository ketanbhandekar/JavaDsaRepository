import java.io.*;
import java.lang.*;
import java.util.Scanner;

class fibonacci
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		int a=0;
		int b=1;

		int cnt=2;

		while(cnt<=n)
		{
			int temp=b;
			b=b+a;
			a=temp;

			cnt++;
		}
		System.out.println(b);
	}
}

import java.io.*;
import java.lang.*;
import java.util.Scanner;

class fibo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER A NUMBER: ");

		int no=sc.nextInt();

		int a=0;
		int b=1;

		System.out.println(a);
		System.out.println(b);

		for(int i=1;i<=no;i++)
		{
			int temp=a+b;
			a=b;
			b=temp;

			System.out.println(temp);
		}
	}
}
