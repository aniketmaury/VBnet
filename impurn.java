import java.io.*;

class multi1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 1 :"+i);
        }
    }
}
class multi2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Thread 1 :"+i);
        }
    }
}
class impurn
{
    public static void main(String args[])
    {
        multi1 m1=new multi1();
        Thread t1=new Thread(m1);
        t1.start();

        multi2 m2=new multi2();
        Thread t2=new Thread(m2);
        t2.start();
    }
}

