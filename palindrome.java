import java.io.*;
import java.lang.*;
import java.util.Scanner;

class palindrome
{
	public static void main(String args[])
	{
		System.out.println("enter a number: ");

		Scanner sc=new Scanner(System.in);

		int no=sc.nextInt();

		int x=0;
		int rem=0;
		int rev=0;

		x=no;

		while(no>0)
		{
			rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(x==rev)
		{
			System.out.println("This is a palindrome number");
		}
		else
		{
			System.out.println("This is not a palindrome number");
		}
	}
}