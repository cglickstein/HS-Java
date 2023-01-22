import java.util.Scanner;

public class D_fuelCapacity {
		public static void main(String[] args) {
			Scanner reader=new Scanner(System.in);
			System.out.print("");
			double capacity;
			double milePerGallon;
			System.out.println("Enter the capacity,in gallons, of fuel tank: ");
			capacity=reader.nextDouble();
			System.out.println("Enter how many miles per gallon the car can go: ");
			milePerGallon=reader.nextDouble();
			System.out.println("A tank with a "+capacity+" gallon capacity that can run "+ milePerGallon+" on every gallon can go up to "+  milePerGallon*capacity+" miles without refueling.");
			
		}

	}

