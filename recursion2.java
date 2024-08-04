import java.io.*;
import java.lang.*;
							//Q.A Function that takes in a no & prints it , print first 5 numbers
class recursion2
{
	public void print(int n)
	{
		if(n==5)
		{
			System.out.println(5);

			return;
		}
		System.out.println(n);
		print(n+1);
	}
	public static void main(String args[])
	{
		recursion2 obj=new recursion2();

		obj.print(1);
	}
}