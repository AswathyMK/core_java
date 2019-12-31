class Test extends Exception
{
	
}
public class ExceptionHandling_Example2 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Test();
		}
		catch(Test t)
		{
			System.out.println("Got the Test Exception");
		}
		//finally always excecutes whether there is any exception occures or not
		finally
		{
			System.out.println("Inside finally block");
		}
	

	}

}
