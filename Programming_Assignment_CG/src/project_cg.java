import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class project_cg {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file1=new Scanner(new FileReader("U:\\file1.txt"));
		Scanner file2=new Scanner(new FileReader("U:\\file2.txt"));
		PrintWriter outFile=new PrintWriter("U:\\results.txt");
		String id1,id2;
		double avg1,avg2;
		double avgGroup1,avgGroup2;
		int x=0;
		
		while (file1.hasNextLine())
		{
			{	x++;
				id1=file1.next();
			file1.nextLine();
			id2=file2.next();
			file2.nextLine();
			if (!(id1.equals(id2)))
			{
				System.out.println("Error: the courses are not the same.");
				break;
			}

		}
		
			
		//System.out.println(x);	
		Scanner file11=new Scanner(new FileReader("U:\\file1.txt"));
		String [][] group1=new String[x][20];
		int i=0;
		int j=0;
		for(i=0; i<group1.length;i++)
		{
			for(j=0; j<group1[0].length;j++)
			{
				group1[i][j]=file11.nextLine();
				System.out.print(group1[i][j]+" ");
			}
			System.out.println(" ");
		}
				
			/*while (a.hasNextLine())
			{	int id=a.nextInt();
				a.nextLine();
				String name=a.nextLine();
				int number=a.nextInt();
				int sum=0;
				while (number != -999)
				{	sum+=number;
					number=a.nextInt();}*/
		}
		outFile.close();
		//inFile1.close();
		//inFile2.close();
	}

}
