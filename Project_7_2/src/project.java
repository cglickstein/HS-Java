import java.util.*;
import java.util.Scanner;
public class project {
	static final double CONVERSION=2.54;

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		String choice="";
		while (!(choice.equals("99")));
		{
		choice=showChoices(reader);
		if (choice.equals("1"))
			inchesToCentimeters(reader);
		if (choice.equals("2"))
			centimetersToInches(reader);
		}
		

	}


	private static String showChoices(Scanner reader) {
		System.out.println("\nOptions:\nPress 1 to convert from inches to centimeters\nPress 2 to convert from centimeters to inches\nPress 99 quit");
		String choice=reader.nextLine();
		return choice;
	}
	private static void inchesToCentimeters(Scanner reader) {
		System.out.println("Enter number of inches you want converted to centimeters: ");
		double inches=reader.nextDouble();
		double cm=inches*CONVERSION;
		System.out.println("There are "+cm+ " centimeters in "+inches+ " inches.");
		}
	private static void centimetersToInches(Scanner reader) {
		System.out.println("Enter number of centimeters you want converted to inches: ");
		double cm=reader.nextDouble();
		double inches=cm/CONVERSION;
		System.out.println("There are "+inches+ " inches in "+cm+ " centimeters.");
		}
}