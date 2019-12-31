
public class WrapperClass_AutoBoxing
{
	public static void main(String[] args) 
	{
		Integer i=20;//converting int into integer
		Integer j=i;//autoboxing ,now compiler will write Intege.valueOf(a) internally
		System.out.println(i+" "+j);

	}

}
