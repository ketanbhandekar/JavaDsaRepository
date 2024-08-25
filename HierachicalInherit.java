import java.io.*;
import java.lang.*;
import java.util.Scanner;

class A
{
	public void methodA()
	{
		System.out.println("METHOD OF A");
	}
}
class B extends A
{
	public void methodB()
	{
		System.out.println("METHOD OF B");
	}
}
class C extends A
{
	public void methodC()
	{
		System.out.println("METHOD OF C");
	}
}
class D extends A
{
	public void methodD()
	{
		System.out.println("METHOD OF D");
	}
}
class HierachicalInherit
{
	public static void main(String args[])
	{
		B obj1=new B();
		C obj2=new C();
		D obj3=new D();

		obj1.methodA();

		obj2.methodA();

		obj3.methodA();
	}
}