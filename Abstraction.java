
public class Abstraction 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	        Racoon racoon=new Racoon("Racoon");
                racoon.eat();
                racoon.breathe();
	}

}
abstract class Animal
{
	private String name;
	public Animal(String name)
	{
		this.name=name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName()
	{
		return name;
	}
}
class Racoon extends Animal
{
	public Racoon(String name)
	{
		super(name);
	}
	public void eat()
	{
	System.out.println(getName()+"is eating");	
	}
	public void breathe()
	{
		System.out.println("Breath in, breathe out, repeat");
	}
	
}
