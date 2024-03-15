import java.io.*;

class thi{
	
	int rollno;  
	String name; 
	
	thi()
	{
		 System.out.println("Default Constructor");
	}
	
	thi(int rollno,String name)
	{
		this();
		this.rollno=rollno;
		this.name=name;
	}
	void disp()
	{
		System.out.println("Roll no.: "+rollno);
		System.out.println("Name: "+name);
	}
}
class the{
	public static void main(String args[]){
		thi a1=new thi(1,"Akshay");
		a1.disp();
	}
}
