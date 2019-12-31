
public class ExceptionalHandling_Example1 {
	static void check()throws ArithmeticException
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("FACE Kollam");
	}
	

	public static void main(String[] args) {
		try
		{
			check();
			
		}catch(ArithmeticException e)
		{
			System.out.println("Caught "+e);
		}
		


	}

}
