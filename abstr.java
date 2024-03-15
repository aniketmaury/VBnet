import java.io.*;

abstract class bike
{
 abstract void display();
}

class Honda extends bike
{
 void display()
 {
 System.out.println("Running Bike");
 }
}

class abstr
{
 public static void main(String args[])
 {
 bike b1 = new Honda();
 b1.display();
 }
}