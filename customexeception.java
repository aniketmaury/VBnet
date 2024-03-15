import java.io.*;

class CustExe extends Exception
{
 public CustExe (String message)
 {
 super(message);
 }
}

public class customexeception {
 public static void validateAge(int age) throws CustExe
 {
 if (age < 18)
 {
 throw new CustExe("Age must be 18 or older.");
 }
else
 {
 System.out.println("Valid age: " + age);
 }
 }

 public static void main(String[] args) {
try
 {
 validateAge(20);
 validateAge(15);
 }
 catch (CustomException e)
 {
 System.out.println("Exception caught: " + e.getMessage());
 }
 }
} 