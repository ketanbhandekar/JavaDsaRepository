import java.io.*;
import java.lang.*;

class OneToNToOneRecur
{
	public void num(int n)
	{
		if(n==6)					//if(n==0)
		{
			return;
		}
		System.out.println(n);				//num(n-1);

		num(n+1);					//System.out.println(n);
	}
	public void num1(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.println(n);

		num1(n-1);
	}
	public static void main(String args[])
	{
		OneToNToOneRecur obj=new OneToNToOneRecur();

		obj.num(1);

		obj.num1(5);
	}
}
							//1234554321
