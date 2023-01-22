import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile=new Scanner(new FileReader("U:\\numbers.txt"));
		PrintWriter outFile=new PrintWriter("U:\\numbersOutfile.txt");
		int num=0;
		int total=0;
		for (int lines=1; lines<=4; lines++) 
		{
			while (num!=-999)
			{
				total+=num;
				num=inFile.nextInt();
			}
			outFile.println("The sum of line "+lines+" is "+total);
			num=0;
			total=0;
		}
		outFile.close();
		inFile.close();
	}

}
