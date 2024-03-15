import java.io.*;

class checkexe
{
 public static void main(String args[])throws IOException
 {
 int a, b, c;

 DataInputStream x = new DataInputStream(System.in);
 System.out.print("Enter The Value Of A: ");
 a= Integer.parseInt(x.readLine());

 System.out.print("Enter The Value Of B: ");
 b= Integer.parseInt(x.readLine());

 c= a + b;

 System.out.println("Sum is: " + c);
 }
} 