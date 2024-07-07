import java.io.*;
import java.lang.*;
import java.util.Scanner;

class tempctotempf
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter temperature in Celsius: ");
		float tempc=sc.nextFloat();

		float tempf=(tempc*9/5)+32;

		System.out.println("Temperature in Fahrenheit: " +tempf);
	}
}