import java.io.*;

class fibonacci{
	public static void main(String args[])throws IOException{
		int a=0,b=1,c,i,n;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("Enter the Number for Fibonacci: ");
		n=Integer.parseInt(x.readLine());
		
		for(i=1;i<=n;i++){
			System.out.println(" "+a);
			c=a+b;
			a=b;
			b=c;
		}
	}
}
