

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		System.out.print("Who is your department head? Mr. ");
		Scanner a=new Scanner(System.in);
		String head=a.next();
		switch (head) {
		case "Jones":
		case "Maples":
		case "Karol":
			System.out.println("VALID");
		break;
		default:
			System.out.println("INVALID");
		}

	}

}
