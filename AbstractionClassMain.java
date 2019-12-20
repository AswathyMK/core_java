import java.util.Scanner;
public class AbstractionClassMain {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		AbstractionClass i=new InheritedClass();
		i.add(a,b);
		i.subtract(a,b);
	}

}
