import java.io.*;

class a
{
 final void display()
 {
 System.out.println("Class A:");
 }
}

class b extends a
{
 void display()
 {
 super.display();
 System.out.println("Class B:");
 }
}

class finmeth
{
 public static void main(String args[])
 {
 b b1 = new b();
 b1.display();
 }
} 