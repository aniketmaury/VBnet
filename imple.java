import java.io.*;

class Multi1 implements Runnable
{
	public void run()
	{
		for(int i=1; i<=0; i++)
		{
			System.out.println("Thread 1 : "+i);
		}
	}
}

class Multi2 implements Runnable
{
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println("Thread 2 : "+i);
		}
	}
}

class imple
{
	public static void main(String args[])
	{
		Multi1 m1=new Multi1();
		Thread t1=new Thread(m1);
		t1.start();
		
		Multi2 m2=new Multi2();
		Thread t2=new Thread(m2);
		t2.start();
	}
}