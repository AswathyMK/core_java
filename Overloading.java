
public class Overloading {
	
	public void area(int a)
	{
		System.out.println("Area of square\n"+(a*a));
	}
	public void area(int l,int b)
	{
		System.out.println("Area of rectangle \n"+(l*b));
	}
	public void area(float b,int h)
	{
		System.out.println("Area of triangle\n"+(0.5*b*h));
	}
	public void area(float r)
	{
		System.out.println("Area of circle\n"+(3.141*r*r));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o=new Overloading();
		o.area(5);
		o.area(5,7);
		o.area(8f,4);
		o.area(5f);

	}

}
