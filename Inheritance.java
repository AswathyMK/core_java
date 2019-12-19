import java.util.Scanner;
 class Parent
 {
	public void add(int n,int m)
	{
		System.out.print((n+m));
	}
 }
 public class Inheritance extends Parent
 {
 	public static void main(String[] args) 
        {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first value:");
		a=sc.nextInt();
		System.out.println("Enter first value:");
		b=sc.nextInt();
		Parent ob=new Inheritance();
		ob.add(a,b);
	}
	public void add(int n,int m) 
	{
		System.out.print((n+m)+10);
	}
}
	
