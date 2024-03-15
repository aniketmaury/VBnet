import java.io.*;

class a
{
	 void get()
	 {
		System.out.println("Base Class");
	 }
}

class b extends a
{
	 void get()
	 {
		System.out.println("Child Class");
	 }

	 void disp()
	 {
		super.get(); get();
	 }
}

class supmeth
{
	public static void main(String args[])
	{
		b b1 = new b(); 
		b1.disp();
	} 
}