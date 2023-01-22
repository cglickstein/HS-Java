import java.io.*;
import java.util.*;
public class C {

	public static void main(String[] args)throws FileNotFoundException { 
		String firstName;
		String answer;
		Scanner inFile=new Scanner (new FileReader("U:\\studentGrades.txt"));
		PrintWriter outFile=new PrintWriter("U:\\studentGradeResults.txt");
		
		String [][] test=new String[4][6];
		int i=0;
		int j=0;
		for(i=0; i<test.length;i++)
		{
			for(j=0; j<test[0].length;j++)
			{
				test[i][j]=inFile.next();
				System.out.print(test[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		int right=0;
		for(i=1; i<test.length;i++)
		{
			for(j=1; j<test[0].length;j++)
			{
				if (test[0][j].equals(test[i][j]))
					{
					right++;
					}
			}
			
		//while(inFile.hasNext())
				outFile.println(test[i][0]+" got "+right+" right.");
		right=0;
		}
		outFile.close();
		inFile.close();



	}}


