//inner class Example
public class OuterClass {
private int a=30;
class Innerclass
{
	public void fun()
	{
		System.out.print(a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass obj=new OuterClass();
		OuterClass.Innerclass e=obj.new Innerclass();
		//OuterClass.Innerclass ob=new OuterClass().new Innerclass();
		//ob.fun();
           e.fun();
	}

}
