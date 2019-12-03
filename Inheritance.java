import java.util.Scanner;
 class Parent{
	public void add(int n,int m)
	{
		System.out.print((n+m));
	}
 }
 public class Inheritance extends Parent
 {
 public static void main(String[] args) 
    {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter first value:");
		a=sc.nextInt();
		System.out.println("Enter first value:");
		b=sc.nextInt();
		Parent ob=new Inheritance();
		ob.add(a,b);
		/*Parent o= new Parent();
		System.out.println("");
		o.add(a,b);
		
		Child obl= new Child();
		System.out.println("");
		
		obl.add(a,b);*/

    
}
 public void add(int n,int m) 
	{
		System.out.print((n+m)+10);
	
	}

  
	
	
}
/*class Child extends Parent
 {
	

}*/

	
