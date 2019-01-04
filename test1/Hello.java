import java.util.*;
import java.io.*;
import java.nio.file.*;
public class Hello
{
	
	public static void main(String [] args) throws IOException
	{
		PrintWriter out=new PrintWriter("myfile.txt");
		out.println("huanhuijing");
		out.println("qihan is a nig man");
		out.println("byby");
		out.println(new Date());
		out.close();
		
		Scanner infile = new Scanner(new File("myfile.txt"));
		//System.out.println(infile.hasNextLine());
		while (infile.hasNextLine())
		{
			System.out.println(infile.nextLine());
		}
		infile.close();
		
	}
}
