import java.io.*;
import java.lang.*;

class ReverseRecurOne
{
	static int rev(int no,int rev)
	{
		if(no==0)
		{
			return rev;
		}
		int rem=no%10;
		rev=rev*10+rem;
		return rev(no=no/10,rev);
	}
	public static void main(String args[])
	{
		ReverseRecurOne obj=new ReverseRecurOne();

		int ans=rev(12345,0);

		System.out.println(ans);
	}
}
