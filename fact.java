import java.io.*;
import java.lang.*;
import java.util.Scanner;

class fact
{
	public static void main(String args[])
	{
		System.out.println("Enter the number to find the factorial: ");

		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();

		int i=0;
		int fact=1;

		for(i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of a given number is: " +fact);
	}
}

