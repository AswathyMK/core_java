import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;


public class FileReadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader b=null;
		try
		{
			String line;
			b=new BufferedReader(new FileReader("C:\\Users\\USER\\eclipse-workspace\\String\\src\\Nishmish.txt"));
			while((line=b.readLine())!=null)
			{
				System.out.print(line);
				StringTokenizer stringTokenizer=new StringTokenizer(line,"|");
				while(stringTokenizer.hasMoreElements())
				{
					Integer id=Integer.parseInt(stringTokenizer.nextElement().toString());
					Double price=Double.parseDouble(stringTokenizer.nextElement().toString());
					String username=stringTokenizer.nextElement().toString();
					StringBuilder sb=new StringBuilder();
					sb.append("\nID :"+id);
					sb.append("\nprice :"+price);
					sb.append("\nUsername :"+username);
					sb.append("\n***********\n");
					System.out.println(sb);
				}
				}
				System.out.println("Done");
			
		}
       catch(IOException e)
		{
	     e.printStackTrace();
		}finally
		{
			try
			{
				if(b!=null)
					b.close();
			}catch (IOException ex)
			{
				ex.printStackTrace();
			}
		}
		
	}

}
