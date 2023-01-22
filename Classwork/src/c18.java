import java.util.*;
import java.io.*; //input output

public class c18 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inFile=new Scanner(new FileReader("U:\\salary.txt"));
		//write to file
		PrintWriter outFile=new PrintWriter("U:\\salaryComplete.txt"); //writes over if exists
		String firstName;
		String lastName;
		double hours;
		double pay;
		firstName=inFile.next(); //nextLine would have gone all the way until end
		lastName=inFile.next();
		hours=inFile.nextDouble();
		pay=inFile.nextDouble();
		double wages= hours*pay;
		inFile.close(); //always close
		System.out.println(firstName + " "+lastName+" "+wages);
		outFile.println("The paycheck for "+firstName+ " "+lastName+"is "+wages);
		outFile.close();

	}

}
