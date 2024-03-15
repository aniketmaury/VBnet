import java.io.*;
 interface i1
 {
	void run();
 }
 interface i2
 {
	void show();
 }
 class inter implements i1 , i2
 {
	public void run()
	{
		System.out.println("Bikes are runing");	
	}
	public void show()
	{
		System.out.println("cars are runing");
	}
	public static void main(String args[])
	{
		inter b1=new inter();
		b1.run();
		b1.show();
	}
 }