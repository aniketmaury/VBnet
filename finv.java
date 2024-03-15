import java.io.*;

class bike
{
 final int speed = 80;

 void run()
 {
 speed = 120;
 System.out.println("Speed Is: " + speed);
 }
}

class finv
{
 public static void main(String args[])
 {
 bike b1 = new bike();
 b1.run();
 }
} 