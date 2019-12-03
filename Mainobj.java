import java.util.Scanner;
public class Mainobj {
public String name,address,cnum,email,ptype,pid;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Mainobj a=new Mainobj();
		Scanner sc=new Scanner(System.in);
		String name,address,cnum,email,ptype,pid;
		System.out.println("Enter your name:");
		a.name=sc.nextLine();
		System.out.println("Enter your address:");
		a.address=sc.nextLine();
		System.out.println("Enter your contact number:");
		a.cnum=sc.nextLine();
		System.out.println("Enter your email:");
		a.email=sc.nextLine();
		System.out.println("Enter proof type:");
		a.ptype=sc.nextLine();
		System.out.println("Enter proof id:");
		a.pid=sc.nextLine();
		System.out.println("Your details are:\n");
		//a.display(name,address,cnum,email,ptype,pid);
		System.out.println("Name:"+a.name);
		System.out.println("Address:"+a.address);
		System.out.println("Contact No:"+a.cnum);
		System.out.println("Email:"+a.email);
		System.out.println("Proof type:"+a.ptype);
		System.out.println("Proof ID:"+a.pid);
		
		
	}

	//public String name;

}
