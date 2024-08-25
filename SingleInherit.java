import java.io.*;
import java.lang.*;
import java.util.Scanner;

class k
{
	int rollno;

	public void info()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER ROLLNO: ");
		rollno=sc.nextInt();
	}
}
class b extends k
{
	int id;

	public void info()
	{
		super.info();

		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER ID: ");
		id=sc.nextInt();

		System.out.println("------------------");

		System.out.println("ROLLNO: " +rollno);
		System.out.println("ID: " +id);
	}
}
class SingleInherit
{
	public static void main(String args[])
	{
		b obj=new b();

		obj.info();
	}
}