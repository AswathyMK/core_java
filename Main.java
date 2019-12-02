import java.util.Scanner;
public class Main {
public String name;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Registration a=new Registration();
		Scanner sc=new Scanner(System.in);
		String name,address,cnum,email,ptype,pid;
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter your address:");
		address=sc.nextLine();
		System.out.println("Enter your contact number:");
		cnum=sc.nextLine();
		System.out.println("Enter your email:");
		email=sc.nextLine();
		System.out.println("Enter proof type:");
		ptype=sc.nextLine();
		System.out.println("Enter proof id:");
		pid=sc.nextLine();
		System.out.println("Your details are:\n");
		//a.display(name,address,cnum,email,ptype,pid);
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact No:"+cnum);
		System.out.println("Email:"+email);
		System.out.println("Proof type:"+ptype);
		System.out.println("Proof ID:"+pid);
		
		
	}

	//public String name;

}
