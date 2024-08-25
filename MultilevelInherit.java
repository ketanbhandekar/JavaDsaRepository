import java.io.*;
import java.lang.*;
import java.util.Scanner;

class G
{
	int age;

	public void info()
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER AGE OF GRANDFATHER: ");
		age=sc.nextInt();
	}
}
class P extends G
{
	int id;

	public void info()
	{
		super.info();

		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER ID OF PARENT: ");
		id=sc.nextInt();
	}
}
class C extends P
{
	int roll;

	public void info()
	{
		super.info();

		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER ROLLNO OF CHILD: ");
		roll=sc.nextInt();

		System.out.println("--------------------------");

		System.out.println("AGE OF GRANDPARENT: " +age);

		System.out.println("ID OF PARENT: "+ id);

		System.out.println("ROLLNO OF STUDENT: " +roll);
	}
}
class MultilevelInherit
{
	public static void main(String args[])
	{
		C obj=new C();

		obj.info();
	}
}