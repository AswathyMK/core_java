import java.io.*;
public class BufferedReader_Example1 
{
	public static void main(String[] args) {
		try
		{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//creating BufferedReader object
		float a=Float.parseFloat(br.readLine());//Reading a number of float type
		double b=Double.parseDouble(br.readLine());//Reading a number of Double type
		System.out.println(a +" \n"+ b);//Return float number and double number
		}
		catch(Exception e)
		{
		
		}
	}
}
