import java.io.*;
import java.lang.*;
import java.util.Scanner;

class digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER NUMBER FOR DIGITS: ");

		int no=sc.nextInt();
		int rem=0;

		while(no>0)
		{
			rem=no%10;

			System.out.println("Digit: "+rem);

			no=no/10;
		}
	}
}



