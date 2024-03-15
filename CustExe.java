import java.io.*;

class CustomException extends Exception
{
 public CustomException (String message)
 {
 super(message);
 }
}

public class customexeception {
 public static void validateAge(int age) throws CustomException
 {
 if (age < 18)
 {
 throw new CustomException("Age must be 18 or older.");
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