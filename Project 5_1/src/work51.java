import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;
import java.io.FileNotFoundException;
public class work51 {

	public static void main(String[] args)throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner inFile=new Scanner(new FileReader("U:\\ID.txt"));
		PrintWriter outFile=new PrintWriter("U:\\SumIdNames.txt");
		String id;
		String name;
		int num=0;
		int sum=0;
		int num2=0;
		String winner=null;
		while (inFile.hasNext())
		{
			
			id=inFile.nextLine();
			
			name=inFile.nextLine();
			
			System.out.println("id: "+id);
			System.out.println("name: "+name);
			outFile.println("name: "+name);
			outFile.println("id: "+id);
			
			
		
			while (num!=-999)
			{
				
				sum+=num;
				num=inFile.nextInt();
				if (sum>num2)
				{	num2=sum;
					winner=name;
					
				}
			
			}
			num=0;
			
			
			outFile.println("sum: "+sum);
			System.out.println("sum: "+sum);
			
			outFile.print("The winner is "+winner);
			sum=0;
			if (inFile.hasNext())//if the file has another line then skip a line if it doesn't then don't skip a line
				inFile.nextLine();
		}
		
		inFile.close();
		outFile.close();

	}

}
