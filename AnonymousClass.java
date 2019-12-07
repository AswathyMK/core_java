
//anonymous class example


abstract class Person
{
	abstract void learn();
	
}



public class AnonymousClass {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person obj=new Person()
		{
		public void learn()
		{
			System.out.print("HAI");
		}
		};
		//AnonymousClass.ob=new AnonymousClass();
		obj.learn();

	}

}
