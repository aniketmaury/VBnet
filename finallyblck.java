import java.io.*; 
 
class finallyblck{ 
 	public static void main(String args[]) 
 	{  	 	try 
 	 	{ 
 	 	 	int data = 25 / 0;  	 	 	System.out.println(data); 
 	 	} 
 	 	catch(NullPointerException e) 
 	 	{ 
 	 	 	System.out.println("Divide by zero"); 
 	 	} 
 	 	finally 
 	 	{ 
 	 	 	System.out.println("Finally Block always executed"); 
 	 	} 
 	} 
} 
 
