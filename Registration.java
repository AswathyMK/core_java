import java.util.Scanner;
public class Registration {
	String name,address,cnum,email,ptype,pid;
	public void Registration(String name,String address,String cnum,String email,String ptype,String pid)
	{
		this.name=name;
		this.address=address;
		this.cnum=cnum;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid;
			
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name,address,cnum,email,ptype,pid;
		Registration a=new Registration();
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
		a.display(name,address,cnum,email,ptype,pid);
		
		// TODO Auto-generated method stub
		
	}
	public void display(String name,String address,String cnum,String email,String ptype,String pid)
	{
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Contact No:"+cnum);
		System.out.println("Email:"+email);
		System.out.println("Proof type:"+ptype);
		System.out.println("Proof ID:"+pid);
		
	}

}
