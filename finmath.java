import java.io.*;
 class a
 {
	final void disp()
	{
		System.out.println("Sita Ram");
	}
 }
 class b extends a
 {
	void dips()
	{
		super.disp();
		
		System.out.println("Only fisrt method print");
	}
 }
 class finmath
 {
	public static void main(String args[])
	{
	b b1=new b();
		b1.disp();
		
	}
 }