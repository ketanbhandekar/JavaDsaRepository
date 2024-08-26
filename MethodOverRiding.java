import java.io.*;
import java.lang.*;

class P
{
	public void greet()
	{
		System.out.println("HELLO");
	}
}
class C extends P
{
	public void greet()
	{
		System.out.println("HELLLLO");
	}
}
class MethodOverRiding								//child-class has same method as declared in parent class.
{
	public static void main(String args[])
	{
		C obj=new C();

		obj.greet();
	}
}
