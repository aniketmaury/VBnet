import java.io.*;

class student
{
 int rollno; String name;
 static String college = "VTP";

 static void change()
 {
 college = "VTP BCA COLLEGE";
 }

 student(int r, String n)
 {
 rollno = r;
 name = n;
 }

 void display()
 {
 System.out.println(rollno + " " + name + " " + college);
 student.change();
 }
}

class staticmeth
{
public static void main(String args[])
{
student s1 = new student(1, "Akshay");
 student s2 = new student(2, "luck");
 s1.display();
 s2.display();
 }
} 