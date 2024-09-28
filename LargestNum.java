import java.io.*;
import java.lang.*;
import java.util.Scanner;

class LargestNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);


		System.out.println("ENTER FIRST NO");
		int a=sc.nextInt();

		System.out.println("ENTER SECOND NO");
		int b=sc.nextInt();

		System.out.println("ENTER THIRD NO");
		int c=sc.nextInt();

		if(a>=b && a>=c)
		{
			System.out.println("A IS MAX");
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B IS MAX");
		}
		else
		{
			System.out.println("C IS MAX");
		}
	}
}