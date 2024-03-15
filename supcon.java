import java.io.*;

class a
{
	a()
		{
			System.out.println("Class A:");
		}
}

class b extends a
{
	b()
		{
			super();
			System.out.println("Class B:");
		}
}

class supcon
	{
		public static void main(String args[])
		{
		b b1 = new b();
		}
} 