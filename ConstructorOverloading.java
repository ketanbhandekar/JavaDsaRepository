import java.io.*;
import java.lang.*;

class k
{
	int roll;
	String name;

	k()
	{
		int roll=17;
		String name="KETAN";
	}
	k(int roll,String name)
	{
		 this.roll=roll;
		 this.name=name;

		System.out.println("ROLLNO: " +roll);
		System.out.println("NAME: " +name);
	}
}
class ConstructorOverloading
{
	public static void main(String args[])
	{
		k obj=new k(10,"ketan");
	}
}