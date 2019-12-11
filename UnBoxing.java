
public class UnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//@SuppressWarnings("deprecation")
		Integer a=new Integer(10);
		int i=a.intValue();//converting integer to int
		int j=i;//unboxing , now compiler will write a.intValue() internally
		System.out.println(a+" "+i+" "+j);

	}

}
