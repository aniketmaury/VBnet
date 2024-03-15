import java.io.*;

interface i1
{
 void run();
}

class bikes implements i1
{
 public void run()
 {
 System.out.println("Car is Running");
 }
}

class fulabstract
{
 public static void main(String args[])
 {
 bikes b1 = new bikes();
 b1.run();
 }
} 