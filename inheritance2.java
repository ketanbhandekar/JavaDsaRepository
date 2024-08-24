import java.io.*;
import java.lang.*;
import java.util.Scanner;

class k
{
	int rollno;

	public void info()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE ROLLNO: ");
		rollno=sc.nextInt();
	}
}
class b extends k
{
	int id;

	public void info() 	//Overriding the methods in inheritance is must.
	{
		super.info();	//accessing info method from parent/base class.

		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE ID: ");
		id=sc.nextInt();

		System.out.println("---------------------------------");
		System.out.println("ROLLNO: " + rollno);
		System.out.println("ID: " +id);
	}
}
class inheritance2
{
	public static void main(String args[])
	{
		b obj=new b();

		obj.info();
	}
}
