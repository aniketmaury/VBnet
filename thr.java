import java.io.*;

class th1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("Thread 1 : " +i);
		}
	}
}
class th2 extends Thread
{
	public void run()
	{
		for(int i=1; i<=10;i++)
		{
			System.out.println("Thread 2 : " +i);
		}
	}
}
class thr
{
	public static void main(String args[])
	{
		th1 t1=new th1();
		th2 t2=new th2();
		
		t1.run();
		t2.run();
		System.out.println("Thread Exit");
	}
}