import java .io.*;
 abstract class a
 {
	abstract void disp();
 }
 class Honda extends a
 {
	void disp()
	
	{
		System.out.println("Hello Tony");
	}
	public static void main(String args[])
	
	{
		a a1=new Honda();
		a1.disp();
	}
 }