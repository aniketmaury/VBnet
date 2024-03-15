import java.io.*;

class calculator{
	public static void main(String args[])throws IOException{
		int a,b,add,sub,multi;
		float div;
		DataInputStream x= new DataInputStream(System.in);
		System.out.print("Enter the First Number: ");
		a=Integer.parseInt(x.readLine());
		
		System.out.print("Enter the Second Number: ");
		b=Integer.parseInt(x.readLine());
		
		add=a+b;
		sub=a-b;
		multi=a*b;
		div=(float)a/b;
		
		System.out.println("Addition: "+add);
		System.out.println("Subtraction: "+sub);
		System.out.println("Multiplication: "+multi);
		System.out.println("Division: "+div);
	}
}
