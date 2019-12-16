import java.util.StringTokenizer;
public class StringTokenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I ,am ,going ,to ,split ,this ,string by, space";
		StringTokenizer st=new StringTokenizer(str);
		System.out.println("split by space");
		while(st.hasMoreElements())
		{
			System.out.print(st.nextElement());
		}
      System.out.println();
      System.out.println("split by ,");
      StringTokenizer st2=new StringTokenizer(str, ",");
      while(st2.hasMoreElements())
      {
    	  System.out.print(st2.nextElement());
      }
    	  
	}

}
