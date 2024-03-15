import java.io.*;

class reverse{

	public static void main(String args[])throws IOException{
		int r,rev=0,n;
		
		DataInputStream x = new DataInputStream(System.in);
		System.out.print("Enter the Number: ");
		n=Integer.parseInt(x.readLine());
		
		while(n!=0){
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println("Reverse Number of is :"+rev);
	}
}
