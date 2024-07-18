import java.io.*;
import java.lang.*;
import java.util.Scanner;

class ip1
{
	public void input()
	{
		Scanner sc=new Scanner(System.in);

		int arr[][]=new int[3][3];

		System.out.println("TAKING THE INPUT: ");

		System.out.println();

		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				arr[row][col]=sc.nextInt();
			}
		}
		System.out.println();

		System.out.println("PRINTING THE INPUT: ");

		System.out.println();

		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])
	{
		ip1 obj=new ip1();

		obj.input();
	}
}