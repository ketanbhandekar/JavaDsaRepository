import java.io.*;
import java.lang.*;
import java.util.Scanner;

class base     //parent class
{
	int a;
	int b;
}
class child extends base
{
	public void sum()										//child()
	{
		int ans;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter The Value of A: ");
		a=sc.nextInt();

		System.out.println("Enter The Value of B: ");
		b=sc.nextInt();

		ans=a+b;

		System.out.println("ADDITION OF 2 NUMBERS : " +ans);
	}
}
class inheritance1
{
	public static void main(String args[])
	{
		child obj=new child();

		obj.sum();
	}
}

//In Inheritance a mechanism by which one object can acquire all the properties (i.e. data members) and behavior
//(i.e. member functions or methods) of a parent object
