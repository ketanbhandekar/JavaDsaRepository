import java.io.*;
import java.lang.*;
import java.util.Scanner;

class armstrong
{
	public static void main(String args[])
	{
		System.out.println("enter a number: ");

		Scanner sc=new Scanner(System.in);

		int no=sc.nextInt();

		int sum=0;
		int rem=0;
		int x=0;

		x=no;

		while(no>0)
		{
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(x==sum)
		{
			System.out.println("This is a Armstrong Number");
		}
		else
		{
			System.out.println("This is Not a Armstrong Number");
		}
	}
}
