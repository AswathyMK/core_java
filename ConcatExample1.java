
public class ConcatExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java string";
		s1.concat("is immutable");//It concatenate new value to the end of s1.but the value of s1 doesn't change.
		System.out.println(s1); // It print the value of s1.
		s1=s1.concat(" is immutabla so assign it explicitly");
		// Here the after concatenation value is assigned to 1st string so value of s1 changes.
		System.out.println(s1);

	}

}
