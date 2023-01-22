import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		showOptions(reader);

	}
	private static void showOptions(Scanner reader) {
		System.out.println("Options: \n"+"Press 1 to convert from inches to centimeters\n"+"Press 99 to convert from centimeters to inches\n"+"Press 3 to quit");
		String choice=reader.nextLine();

	
	}
	
}
