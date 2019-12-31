import java.io.*;
public class BufferedReader_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		float a=Float.parseFloat(br.readLine());
		double b=Double.parseDouble(br.readLine());
		System.out.println(a +" \n"+ b);
		}
		catch(Exception e)
		{
		
		}
		

	}

}
