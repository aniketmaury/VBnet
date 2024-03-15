import java.io.*;
 class thr1 extends Thread
 {
		public void run()
		{
				try
				{
					for(int i=1;i<=5;i++)
					{
							Thread.sleep(2000);
							System.out.println("Thread 1:"+i);
					}
				}
				catch(Exception e)
				{
						System.out.println(e);
				}
					
		}
 }
 class thr2 extends Thread
 {
		public void run()
		{
				try
				{
					for(int i=1;i<=5;i++)
					{
							Thread.sleep(2000);
							System.out.println("Thread 2:"+i);
					}
				}
				catch(Exception e)
				{
						System.out.println(e);
				}
		}
 }
 class thslp
 {
		public static void main(String args[])
		{
			thr1 t1=new thr1();
			t1.start();
			thr1 t2=new thr1();
			t2.start();
		}
 }