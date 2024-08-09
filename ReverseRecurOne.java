import java.io.*;
import java.lang.*;

class main
{
	public static void Reverse(int num)
	{
        // base condition to end recursive calls
        if (num < 10)
        {
            System.out.println(num);

         	return;
        }
        else
        {
            // print the unit digit of the given number
            System.out.print(num % 10);
            // calling function for remaining number other than unit digit
            Reverse(num / 10);
        }
    }
    // driver code
    public static void main(String args[])
    {
        // number to be reversed
        int num = 100;

        System.out.print("Reversed Number: ");
        // calling recursive function to print the number in reversed form
        Reverse(num);
    }
}




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
