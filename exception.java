import java.io.*;
import java.lang.*;

class exception
{
	public static void main(String argsp[])
	{
		int a=10;
		int b=0;

		try
		{
			int c=a/b;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("THIS WILL ALWAYS EXCEUTE");
		}
	}
}
