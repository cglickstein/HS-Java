import java.util.Scanner;

public class A_pos {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter number: ");
		double numb=reader.nextDouble();
		
		if (numb<0)
		{
			System.out.println(numb+" is negative.");
		}
		else if (numb==0)
			System.out.println(numb+" is zero.");
		else if (numb>0)
			System.out.println(numb+" is positive.");
		


		


	

	}

}
