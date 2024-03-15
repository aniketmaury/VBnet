import java.io.*;

public class Strbuf {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        sb.append(" ");
        sb.append("World");
        System.out.println("After appending: " + sb);

        sb.insert(5, " Java");
        System.out.println("After inserting: " + sb);

        sb.delete(5, 10);
        System.out.println("After deleting: " + sb);

        sb.reverse();
        System.out.println("After reversing: " + sb);

        sb.replace(5, 10, "Universe");
        System.out.println("After replacing: " + sb);

        System.out.println("Length of StringBuffer: " + sb.length());

        System.out.println("Capacity of StringBuffer: " + sb.capacity());

        sb.setLength(5);
        System.out.println("After setting length: " + sb);

        sb.ensureCapacity(20);
        System.out.println("After ensuring capacity: " + sb);

        sb.trimToSize();

        System.out.println("After trimming to size: " + sb);

        String sub = sb.substring(2, 5);
        System.out.println("Substring: " + sub);
    }
}
