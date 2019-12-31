public class ExceptionHandling_Example1 
{
	static void check()throws ArithmeticException//throws keyword used to show that which exception are to be handled
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("FACE Kollam");
	}
	public static void main(String[] args) 
	{
		//try catch block is used for exception handling
		try //Exception making statements are written in try block.
		{
			check();
			
		}
		catch(ArithmeticException e)//to catch exception and handle it.
		{
			System.out.println("Caught "+e);
		}
	}
}
