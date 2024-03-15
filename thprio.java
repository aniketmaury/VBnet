import java.io.*;

class thprio extends Thread
{
    public void run()
    {
        System.out.println("Running Thread Name:- " + Thread.currentThread().getName());
        System.out.println("Priority Thread Name:- " + Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        thprio th1 = new thprio();
        thprio th2 = new thprio();
        th1.setPriority(Thread.MIN_PRIORITY);
        th2.setPriority(Thread.MAX_PRIORITY);
        th1.start();
        th2.start();
    }
}