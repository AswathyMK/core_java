import java.io.Console;
public class Console_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
        Console consoleobj=System.console();//creating console object
        if(consoleobj==null)
        {
        	System.out.println("No console available");
        	return;
        }
        
        str = consoleobj.readLine("Enter your name:");//reading name of string type
        System.out.println(str);
        char[] ch=consoleobj.readPassword("Enter your password:");//reading password in to char array
        String pswd=String.valueOf(ch);
        System.out.println("Password :"+pswd);
	}

}
