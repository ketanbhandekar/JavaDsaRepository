import java.io.*;
import java.lang.*;
import java.util.Scanner;

class kb
{
	int a;
	int b;
	int ans;

	kb()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER A: ");
		a=sc.nextInt();

		System.out.println("ENTER B: ");
		b=sc.nextInt();

		ans=a+b;

		System.out.println("ADDITION OF 2 NUMBERS: " +ans);
	}
}
class constructor
{
	public static void main(String args[])
	{
		kb obj=new kb();
	}
}