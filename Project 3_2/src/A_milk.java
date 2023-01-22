import java.util.Scanner;

public class A_milk {

	public static void main(String[] args) {
				
		Scanner reader = new Scanner(System.in);
		double liters;
		System.out.print("Enter total amount  of milk produced in the morning in liters: ");
		liters=reader.nextDouble();	
		int cartons;
		cartons= (int)(liters/3.78);
		System.out.println(" milk cartoons needed to hold milk : " + cartons);
		System.out.println(" The cost of producing milk is: " + liters*.38 +" dollars.");
		System.out.println("Profit earned: " + cartons*.27+ " dollars.");

	}

}
