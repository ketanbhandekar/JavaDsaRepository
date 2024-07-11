import java.io.*;
import java.lang.*;

class swap1  //swap without third variable without function
{
	public static void main(String args[])
	{
		int a=10;
		int b=20;

		System.out.println("BEFORE SWAPPING THE VALUES: ");
		System.out.println();

		System.out.println("VALUE OF A: "+a);
		System.out.println("VALUE OF B: "+b);

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println();

		System.out.println("AFTER SWAPPING THE VALUES: ");
		System.out.println();

		System.out.println("VALUE OF A: "+a);
		System.out.println("VALUE OF B: "+b);
	}
}
