
public class StringHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1,s2;
		s1=new String("Aswathy");
        s2=new String("Aswathy");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        s2=s1+s2;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
	}

}
