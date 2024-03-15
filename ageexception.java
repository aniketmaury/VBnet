import java.io.*;

class ageexception1 extends Exception
{
	ageexception1(String message)
	{
			super(message);
	}
}
class inexception
{
	static void excep(int age)throws ageexception1
	{
		if(age<0)
		{
				throw new ageexception1("Negative");
		}
	}
}
	public class j207
	{
			public static void main(String args[])
			{
				try
				{
					inexception.excep(-2);
				} 
				catch(ageexception1 e)
				{
					System.out.println("Error:"+e.getMessage());
				}
			}
	}
