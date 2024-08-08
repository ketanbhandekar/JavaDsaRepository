import java.io.*;
import java.lang.*;
					//Q.A Function that takes in a no & prints it , print first 5 numbers
class recursion2
{
	public void print(int n)
	{
		if(n==6)		//Because We Have to print till 5 So,				//if(n==0)
		{
			//System.out.println(5);							
			return;
		}
		System.out.println(n);									//print(n-1)
		print(n+1);				//Tail Recursion. (Last Function Call)		//System.out.println(n);	
	}
	public static void main(String args[])
	{
		recursion2 obj=new recursion2();

		obj.print(1);
	}
}




import java.io.*;

class RecursionWithoutPassingValue {
    // Class-level variable to keep track of the current number (with original value private is not needed)
    private int currentNumber = 1;				

    public void print() {
        if (currentNumber == 5) {
            System.out.println(currentNumber);
            return;
        }
        System.out.println(currentNumber);
        currentNumber++;
        print();
    }

    public static void main(String args[]) {
        RecursionWithoutPassingValue obj = new RecursionWithoutPassingValue();
        obj.print();
    }
}
