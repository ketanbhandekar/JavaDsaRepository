import java.io.*;
import java.lang.*;

interface Boy
{
	void play();
}
interface Girl
{
	void sing();
}
class Student implements Boy , Girl
{
	public void play()
	{
		System.out.println("BOY IS PLAYING");
	}
	public void sing()
	{
		System.out.println("GIRL IS SINGING");
	}
}
class MultipleInherit
{
	public static void main(String args[])
	{
		Student obj=new Student();

		obj.play();

		obj.sing();
	}
}