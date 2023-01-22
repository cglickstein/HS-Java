

import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		System.out.print("What is your department code? ");
		Scanner a=new Scanner(System.in);
		String dep=a.next();
		String department=" ";
		switch (dep.toUpperCase()) {
		case "A":
			department="Accounting";
			break;
		case "M":
			department="Marketing";
			break;
		case "H":
			department="Human Resources";
		break;
		case "I":
			department="Information Technology";
		break;
		case "L":
			department="Legal";
		break;
		default:
			System.out.println("That is not a valid department.");
		}
		if (department!=" ")
			System.out.println("Your department is "+department+'.');

	}

}
