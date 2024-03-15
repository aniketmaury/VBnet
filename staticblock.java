import java.io.*;
class a
{
 static int i;

 static
 {
 i = 35;
 }
}

class staticblock
{
 public static void main(String args[])
 {
 System.out.println(a.i);
 }
}