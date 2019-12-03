
 class poly{
	
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
	 
	 
	 
	 
       }





public class Overriding  extends poly{

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
	/*public void area(float r)
	{
		System.out.println("Area of circle\n"+(((3.141*r*r))+10));
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Overloading o=new Overloading();
		poly o=new poly();
		poly obj=new Overriding();
		//Overriding ob=new poly();
		o.area(5);
		o.area(5,7);
		o.area(8f,4);
		o.area(5f);

		obj.area(5);
		obj.area(5,7);
		obj.area(8f,4);
		obj.area(5f);

		

	}

}
