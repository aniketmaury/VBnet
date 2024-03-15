import java.io.*;

class oddeven{
	public static void main(String args[])throws IOException{
		int n;
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("Enter a number to check: ");
		n=Integer.parseInt(x.readLine());
		
		if(n%2==0){
			System.out.println("Number "+n+"is even");
		}else{
			System.out.println("Number "+ n +" is odd");
		}
	}
}
