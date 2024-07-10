import java.io.*;
import java.lang.*;
import java.util.Scanner;

class day
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER A VALID DAY AS PER FOLLOWS: ");

		System.out.println();

		System.out.println("1.MONDAY");
		System.out.println("2.TUESDAY");
		System.out.println("3.WEDNESDAY");
		System.out.println("4.THURSDAY");
		System.out.println("5.FRIDAY");
		System.out.println("6.SATURDAY");
		System.out.println("7.SUNDAY");

		System.out.println();

		System.out.println("ENTER YOUR DAY AS PER YOUR CHOICE: ");
		int ch=sc.nextInt();

		switch(ch)
		{
			case 1:
			{
				System.out.println("MONDAY");

				break;
			}
			case 2:
			{
				System.out.println("TUESDAY");

				break;
			}
			case 3:
			{
				System.out.println("WEDNESDAY");

				break;
			}
			case 4:
			{
				System.out.println("THURSDAY");

				break;
			}
			case 5:
			{
				System.out.println("FRIDAY");

				break;
			}
			case 6:
			{
				System.out.println("SATURDAY");

				break;
			}
			case 7:
			{
				System.out.println("SUNDAY");

				break;
			}
			default:
			{
				System.out.println("INVALID DAY");

				break;
			}
		}
	}
}

