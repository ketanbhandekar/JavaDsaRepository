import java.io.*;
import java.lang.*;
import java.util.Scanner;

class palinrecur
{							//Check the Dry-run
	static void pal(int no)
	{
		if(no==0)
		{
			return;
		}
		int x=0;
		int rem=0;
		int rev=0;

		x=no;

		pal(no/10);

		if(x==no)
		{
			System.out.println("PALIN");
		}
		else
		{
			System.out.println("NOT PALIN");
		}
	}
	public static void main(String args[])
	{
		palinrecur obj=new palinrecur();

		obj.pal(1221);
	}
}

