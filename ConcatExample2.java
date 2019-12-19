
public class ConcatExample2 
{
	public static void main(String[] args)
	{
		String s1="Hello";
		String s2="FAE@2.0";
		String s3="Reader";
		//concatenation of single string
		String s4=s1.concat(s2);
		System.out.println(s4);
		//concatenating multiple strings
		String s5=s1.concat(s2).concat(s3);
		System.out.println(s5);

	}

}
