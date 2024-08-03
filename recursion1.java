import java.io.*;				//Recursion in java is a process in which a method calls itself continuously.A method in java that calls itself is called recursive method.
import java.lang.*;
							//Q.A Function have to call & that should print ketan bhandekar 5 times.
class recursion1
{
	public void message()
	{
		System.out.println("KETAN BHANDEKAR");

		message1();
	}
	public void message1()
	{
		System.out.println("KETAN BHANDEKAR-1");

		message2();
	}
	public void message2()
	{
		System.out.println("KETAN BHANDEKAR-2");

		message3();
	}
	public void message3()
	{
		System.out.println("KETAN BHANDEKAR-3");

		message4();
	}
	public void message4()
	{
		System.out.println("KETAN BHANDEKAR-4");
	}
	public static void main(String args[])
	{
		recursion1 obj=new recursion1();

		obj.message();
	}
}