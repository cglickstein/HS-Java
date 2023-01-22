
import java.io.*;
import java.util.*;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner a=new Scanner(new FileReader("U:\\ID.txt"));
		PrintWriter b=new PrintWriter("U:\\results.txt");
		String big="";
		int most=0;
		while (a.hasNextLine())
		{	int id=a.nextInt();
			a.nextLine();
			String name=a.nextLine();
			int number=a.nextInt();
			int sum=0;
			while (number != -999)
			{	sum+=number;
				number=a.nextInt();}
			if (a.hasNextLine())
				b.println(name+" "+id+": "+sum);
			
			else
				b.print(name+" "+id+": "+sum);
			b.close();
			Scanner c=new Scanner(new FileReader("U:\\results.txt"));
			
			if (sum>most)
			{	most=sum;
				big=name;
				c.close();}}
		
		PrintWriter d=new PrintWriter("U:\\results.txt");
		d.print("\nThe winner is "+big+", who had "+most+" votes.");
		System.out.println("The winner is "+big+" who had "+most+" votes.");
		
		d.close();
		a.close();
	}
}