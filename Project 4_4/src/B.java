

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		System.out.print("What number demartment do you work in? ");
		Scanner a=new Scanner(System.in);
		int dep=a.nextInt();
		String head=" ";
		switch (dep) {
		case 1:
		case 2:
		case 3:
			head="Jones";
		break;
		case 4:
			head="Maples";
		break;
		case 5:
			head="Karol";
		break;
		default:
			System.out.println("That is not a valid department.");
		}
		if (head!=" ")
			System.out.println("Your head is Mr. "+head+'.');
	}

}
