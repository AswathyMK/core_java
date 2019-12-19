
public class CompareToExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//5 because 2nd String is null so it return length of first string.
		System.out.println(s2.compareTo(s3));//-2 because 1st string is null so it return length of second string .
		

	}

}
