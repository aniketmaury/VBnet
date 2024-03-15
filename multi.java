import java.io.*;

interface i1
{
 void run();
}

interface i2
{
 void show();
}

class bikes implements i1, i2
{
 public void run()
 {
 System.out.println("Bike Is Running");
 }

 public void show()
 {
 System.out.println("Car Is Running");
 }
}

class multi
{
 public static void main(String args[])
{
 bikes b1 = new bikes();
 b1.run();
 b1.show();
 }
} 