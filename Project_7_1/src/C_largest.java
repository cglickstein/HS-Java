import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class C_largest {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		double max1=0;
		double max=0;
		for(int i=0;i<10;i++)
			{System.out.println("Enter a number: ");
			double num = reader.nextDouble();
			max=largestNum(num,max);
			
			}
		System.out.println("max: "+ max);
	}
	public static double largestNum (double num, double max) 
	{
		if(num>max)
		{
			return num;
		}
		else 
			return max;
	}
}
