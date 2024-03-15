import java.io.*;

class clac
{
 int c;
 void add(int a, int b)
 {
 c = a + b;
 System.out.println("Value Of C IS: " + c);
 }

 void add(int a, int b, int d)
 {
 c = a + b + d;
 System.out.println("Value Of C : " + c);
 }
}

class methodoverload
{
 public static void main(String args[])
 {
 clac c1 = new clac(); c1.add(10, 20);
 c1.add(5, 12, 7);
 }
} 