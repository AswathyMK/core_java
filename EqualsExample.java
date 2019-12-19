
public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="facenow";
		String s2="facenow";
		String s3="faceprep";
		String s4="facenxt";
		System.out.println(s1.equals(s2));//true because content and case are equal
		System.out.println(s1.equals(s3));//false because content is not same
		System.out.println(s1.equals(s4));//false because content not same

	}

}
