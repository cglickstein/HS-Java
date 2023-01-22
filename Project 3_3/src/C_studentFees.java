import java.util.Scanner;

public class C_studentFees {

	public static void main(String[] args) {
		Scanner reader= new Scanner (System.in);
		System.out.print("Number of credit hours in which student is enrolled: ");
		int creditHours= reader.nextInt();
		System.out.print("Amount of money spent on books: ");
		double bookMoney= reader.nextDouble();
		double creditCost= creditHours*85.0;
		double fee= creditCost+65+bookMoney;
		System.out.print("Total fee: "+ fee);

	}

}
