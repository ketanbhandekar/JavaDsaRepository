import java.io.*;
import java.lang.*;

class reverse
{
	public static void main(String args[])
	{
		int num=12345;
		int rev=0;
		int rem=0;

		while(num>0)
		{
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		System.out.println("Reverse Of The Number: " +rev);
	}
}