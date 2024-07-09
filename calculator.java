import java.io.*;
import java.lang.*;
import java.util.Scanner;

class calculator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int ans=0;

		System.out.println("ENTER THE FIRST NUMBER: ");
		int n1=sc.nextInt();

		System.out.println("ENTER THE SECOND NUMBER: ");
		int n2=sc.nextInt();

		System.out.println();

		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.DIVISION");

		System.out.println();

		System.out.println("Enter The Choice: ");
		int ch=sc.nextInt();

		System.out.println();

		switch(ch)
		{
			case 1:
					ans=n1+n2;

					System.out.println("ADDITION: " +ans);

					break;

			case 2:
					ans=n1-n2;

					System.out.println("SUBTRACTION: " +ans);

					break;

			case 3:
					ans=n1*n2;

					System.out.println("MULTIPLICATION: " +ans);

					break;

			case 4:
					ans=n1/n2;

					System.out.println("DIVISION: " +ans);

					break;

			default:
					System.out.println("INVALID CHOICE: ");

					break;
		}
	}
}

