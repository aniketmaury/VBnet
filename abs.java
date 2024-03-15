import java.io.*;
  abstract class bikes
  {
	abstract void disp();
  }
  class abs implements bikes
  {
	  void disp()
	  {
		  System.out.println("Bikes are runing");
	  }
	  public static void main(String args[])
	  {
		  bikes a=new abs();
		  a.disp();
	  }
  } 