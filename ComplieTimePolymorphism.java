import java.io.*;
import java.lang.*;

class cal	//Method Overloading- When a Class has multiple methods with the same name, but different parameters.
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
}
class ComplieTimePolymorphism 			//Also Known as Static Polymorphism.		
{
	public static void main(String args[])
	{
		cal obj=new cal();

		int sum1=obj.add(10,10);

		System.out.println("ADDITION OF INTEGER: " +sum1);

		int sum2=obj.add(20,20);

		System.out.println("ADDITION OF FLOAT: " +sum2);
	}
}
