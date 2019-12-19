
public class charAtExample4 {

	public static void main(String[] args) {
	
       String s="Welcome to FACE portal";
       int count=0;
      for(int i=0;i<s.length();i++)//Start from 0 to String length-1.
     {
	    if(s.charAt(i)=='t')       //if character at each index match 't'.
	    {
		     count++;
	    }
    }
     System.out.print("Freaquency of t is: "+count);
	}

}
