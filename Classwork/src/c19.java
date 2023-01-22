import java.io.*;
import java.util.*;
public class c19 {

	public static void main(String[] args)throws FileNotFoundException { 
		String firstName;
		double testScore;
		char grade= ' ';
		double classAverage;
		double sum=0;
		int count=0;
		Scanner inFile=new Scanner (new FileReader("U:\\students.txt"));
		PrintWriter outFile=new PrintWriter("U:\\studentResults.txt");
		while (inFile.hasNext()) {
			firstName=inFile.next();
			testScore=inFile.nextDouble();

			sum+=testScore;
			count++;
			switch((int) testScore/10)
			{
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				grade='F';
			case 6:
				grade='D';
			case 7:
				grade='C';
			case 8:
				grade='B';
			case 9:
			case 10:
				grade='A';
			default:
				System.out.println("Invalid Score.");
			}
			outFile.println(firstName+"\t\t\t"+grade);
		}
			if(count!=0)
				outFile.println("No Data");
			outFile.close();
			inFile.close();
		

	}

}
