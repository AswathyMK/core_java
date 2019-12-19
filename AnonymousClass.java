
//anonymous class example
abstract class Person
{
	abstract void learn();
	
}
public class AnonymousClass
{
	public static void main(String[] args) 
	{
		Person obj=new Person()
		{
			public void learn()
			{
				System.out.print("HAI");
			}
		};
		
		obj.learn();

	}

}
