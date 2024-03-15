import java.io.*;

class bca
{
 int roll; String name;
 static String cls = "BCA";

 bca(int r, String s)
 {
 roll = r;
 name = s;
 }
 void display()
 {
 System.out.println("Roll No: " + roll + " " + "Name: " + name + "
" + "Class: " + cls);
 }
}

class statvar
{
 public static void main(String args[])
 {
 bca b1 = new bca(1, "Raj");
 b1.display();
 }
}