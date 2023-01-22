import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class CG_PROJECT_DATA_COMPARISON {

	public static void main(String[] args) throws FileNotFoundException 
	{
		Scanner file1=new Scanner(new FileReader("U:\\file1.txt"));
		Scanner file2=new Scanner(new FileReader("U:\\file2.txt"));
		PrintWriter outFile=new PrintWriter("U:\\results.txt");
		String id1,id2;
		double avg1,avg2;
		double avgGroup1,avgGroup2, grandAverage2, grandAverage1;
		int num1=0,num2=0,count=0, total=0, total2=0, count2=0, i=0, grandTotal2=0, grandTotal1 = 0;
		double csc1, csc2, eng1, eng2, his1, his2, mth1, mth2, phy1, phy2;
		double [] averageList= new double [10];
		String [] idList= new String[10];
		
		while (file1.hasNextLine())
		{
			{	id1=file1.next();
			idList[i]=id1;
			//file1.nextLine();
			while (num1!=-999)
			{
				total+=num1;
				num1=file1.nextInt();
				System.out.println(num1);
				//num2=file2.nextInt
				count++;
			}
			num1=0;
			
			System.out.println("YELLOOOOOOOOOOOOOOOOOOOOOOOO");
			//double avg=
			calculateAverage(total,count, averageList, i);
			i++;
			//System.out.println(avg);
			System.out.println(count);
			count=0;
			System.out.println(total);
			total=0;
			id2=file2.next();
			idList[i]=id2;
			
			Scanner file22=new Scanner(new FileReader("U:\\file2.txt"));
			while (num2!=-999)
			{
				total2+=num2;
				num2=file2.nextInt();
				System.out.println(num2);
				//num2=file2.nextInt
				count2++;
			}
			num2=0;

			System.out.println("YELLOOOOOOOOOOOOOOOOOOOOOOOO");
			calculateAverage(total2,count2, averageList, i);
			i++;
			//System.out.println(avg21);
			System.out.println(count2);
			count2=0;
			System.out.println(total2);
			total2=0;
			
			
			//file2.nextLine();
			System.out.println(id1+" "+id2);
			if (!(id1.equals(id2)))
			{
				System.out.println("Error: the courses are not the same.");
				break;
			}

			}
			//printResult();
			

		}

		for (int j=0; j<averageList.length; j++)
			{
			System.out.println(averageList[j]);
			if (j%2==0)
				{grandTotal2+=averageList[j];
				System.out.println(averageList[j]);
				System.out.println(j);}
			else
				{grandTotal1+=averageList[j];
				System.out.println(averageList[j]);
				System.out.println(j);}
			}
		grandAverage2=grandTotal2/(averageList.length/2);
		grandAverage1=grandTotal1/(averageList.length/2);
		System.out.println("group 1: "+grandAverage1);
		System.out.println("group 2: "+grandAverage2);
		//for (int j=0; j<idList.length; j++)
			//System.out.println(idList[j]);
		
		printResult(idList, averageList, outFile);
		printHeading(outFile);
		outFile.close();
		file1.close();
		file2.close();
	}


	private static void calculateAverage(int total, int count, double[] averageList, int i) {
		double avg=((total*1.0)/(count-1));
		System.out.printf("%.2f",avg);
		//return avg;
		//printResult(avg);
		
		averageList[i]=avg;
		
		
		//return avg;
	}

	private static void printResult(String[] idList, double[] averageList, PrintWriter out) {
		System.out.println("\n"+idList[0]+" "+averageList[0]);

		
	}
	public static void printHeading(PrintWriter out)
	{
		out.println("Course\t\t\t\t\tCourse Average"); //5 tabs
		out.println("	ID	0	10	20	30	40	50	60	70	80	90	100	");
		out.println("		|.......|.......|.......|.......|.......|.......|.......|.......|.......|.......|");
	}
}

