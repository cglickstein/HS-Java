import java.util.Scanner;

public class C_income {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Gross income-without taxes: ");
		double gross=reader.nextDouble();
		double gross1=gross-10000;
		System.out.println("Enter number of people in your house: ");
		int ppl=reader.nextInt();
		double gross2=gross-(ppl*2000);
		System.out.println("income tax taken off from taxes: "+(gross-gross2));
		System.out.println("Final net income: "+gross2);
		
		
		
		

	}

}
