import java.io.*;
import java.lang.*;

class countingoccurances
{
	public static void main(String args[])
	{
		int n=45536;
		int rem;
		int cnt=0;

		while(n>0)
		{
			rem=n%10; //it gives the last digit

			if(rem==5)
			{
				cnt++;
			}
			n=n/10; //reduce the number
		}
		System.out.println("Count Occurances : " +cnt);
	}
}