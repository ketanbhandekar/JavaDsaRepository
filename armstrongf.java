import java.io.*;
import java.lang.*;
import java.util.Scanner;

class kb
{
	public void arm()
	{
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();

		int sum=0;
		int rem=0;
		int x=0;
		
		x=no;

		while(no>0)
		{
			rem=no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
		}
		if(x==sum)
		{
			System.out.println("This is a Armstrong Number");
		}
		else
		{
			System.out.println("This is Not a Armstrong Number");
		}
	}
}
class armstrongf
{
	public static void main(String args[])
	{
		kb obj=new kb();

		obj.arm();
	}
}
