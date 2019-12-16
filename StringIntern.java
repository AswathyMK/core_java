
public class StringIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="well";
		String ab="All is "+a;
		String abc="All is well";
		String abcd="All is well";
		System.out.println(abc.hashCode());
		
		System.out.println(ab.hashCode());
		//System.out.println(abc==ab.intern());
		System.out.println(abc==ab);
		
		System.out.println(abcd.hashCode());

	}

}
