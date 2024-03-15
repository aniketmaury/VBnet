import java.io.*;

class a
	{
		int a = 10;
	}

class b extends a
{
	int a = 20;
	void disp()
	{
		System.out.println("Value Of Class A: " + super.a);
		System.out.println("Value Of Class B: " + a);
	}
}

class supv
{
	public static void main(String args[])
	{
		 b b1 = new b();
		b1.disp();
	}
} 