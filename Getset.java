import java.util.Scanner;
public class Getset 
{
	String name,address,cnum,email,ptype,pid;
	public void setname(String name,String address,String cnum,String email,String ptype,String pid)
	{
		this.name=name;
		this.address=address;
		this.cnum=cnum;
		this.email=email;
		this.ptype=ptype;
		this.pid=pid;
	}
	public static void main(String[] args) 
	{
		
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
		Getset d=new Getset();
		d.setname(name,address,cnum,email,ptype,pid);
		System.out.println("Name:"+d.getname());
		System.out.println("Address:"+d.getadd());
		System.out.println("Contact No:"+d.getcnum());
		System.out.println("Email:"+d.getemail());
		System.out.println("Proof type:"+d.getptype());
		System.out.println("Proof ID:"+d.getpid());
	}
	public String getname()
	{
		return name;
	}
	public String getadd()
	{
		return address;
	}
	public String getcnum()
	{
		return cnum;
	}
	public String getemail()
	{
		return email;
	}
	public String getptype()
	{
		return ptype;
	}
	public String getpid()
	{
		return pid;
	}



}
