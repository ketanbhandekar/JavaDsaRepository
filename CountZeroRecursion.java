import java.io.*;
import java.lang.*;

class ZeroRecur
{
	static int count(int n)
	{
		return helper(n,0);
	}
	static int helper(int n,int c)
	{
		if(n==0)
		{
			return c;
		}
		int rem=n%10;

		if(rem==0)
		{
			return helper(n/10,c+1);
		}
		return helper(n/10,c);
	}
	public static void main(String args[])
	{
		System.out.println(count(10204));
	}
}



import java.io.*;
import java.lang.*;

class CountZeroRecursion
{
	public static int countZerosRec(int input)
	{
	        if(input<10)
	        {
	            if(input==0)
	            return 1;
	        else
	            return 0;
	        }

	        int smallAns= countZerosRec(input/10);
	        if(input%10==0)
	            smallAns=1+smallAns;
	        return smallAns;
	}
	public static void main(String args[])
	{
		CountZeroRecursion obj=new CountZeroRecursion();

		int ans=countZerosRec(10203);

		System.out.println(ans);
	}
}



import java.io.*;
import java.lang.*;

class CoutZeroesRecursive
{
	public static void main(String[] args)
	{
		System.out.println(countZerosRec(10204));
	}
	public static int countZerosRec(int input){
		if(input==0) //Just to handle the case when input=0
		{
			return 1;
		}
		if(input<10)//this is the actual base case
		{
			return 0;
		}
		else if(input%10==0)
		{
			return 1+countZerosRec(input/10);
		}
		return countZerosRec(input/10);

	}
}
