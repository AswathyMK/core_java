
public class ObjectClass {
	static int last_roll=100;
	int roll_no;
ObjectClass()
{
	roll_no=last_roll;
	last_roll++;
}public int hashcode()
{
	return roll_no;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectClass s=new ObjectClass();
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FACE");
		Class c=obj.getClass();
		System.out.println("Class of object is: "+c.getName());
		s=null;
		//System.gc();

	}protected void finalize()
	{
		System.out.println("Finalize method called");
	}

}
