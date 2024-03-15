import java.io.*;

class prime{
	
	public static void main(String args[])throws IOException
	{
		DataInputStream x=new DataInputStream(System.in);
		System.out.println("Enter a Number: ");
		int n=Integer.parseInt(x.readLine());
		if(isPrime(n)){
			System.out.println(n +" is a Prime Number");
		}
		else{
			System.out.println(n +" is not a Prime Number");
		}
	}
	public static boolean isPrime(int n){
		if(n<=1){
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++){
			if(n%1==0){
				return false;
			}
		}
		return true;
		}
	}