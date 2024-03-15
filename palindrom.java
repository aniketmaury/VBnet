import java.io.*;

class palindrom{

	public static void main(String args[])throws IOException{
		int r,rev=0,s,n;
		DataInputStream x= new DataInputStream(System.in);
		System.out.println("Enter the Number to check: ");
		n=Integer.parseInt(x.readLine());
		s=n;
		while(n!=0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==s)
		{
			System.out.println("It's a Palindrome");
		}
		else
		{
			System.out.println("It's a not Palindrome");
		}
	}
}
