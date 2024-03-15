import java.io.*;

final class a
{
 a()
 {
 System.out.println("Class A:");
 }
}

class b extends a
{
 b()
 {
 super();
 System.out.println("Class B:");
 }
}

class fincls
{
 public static void main(String args[])
 {
 b b1 = new b();
 }
} 