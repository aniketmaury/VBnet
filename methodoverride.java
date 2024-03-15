import java.io.*;

class a
{
 void display()
 {
 System.out.println("Old Class A:");
 }
}

class b extends a
{
 void display(int a)
 {
 System.out.println("New Class A: " + a);
 }
}

class methodoverride
{
 public static void main(String args[])
 {
 b b1 = new b();
 b1.display();
 b1.display(10);
 }
}
