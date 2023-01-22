

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		System.out.print("What grade are you in? ");
		Scanner a=new Scanner(System.in);
		int grade=a.nextInt();
		switch(grade)
			{case 9:
				System.out.println("Freshman");
			break;
			case 10:
				System.out.println("Sophmmore");
			break;
			case 11:
				System.out.println("Junior");
			break;
			case 12:
				System.out.println("Senior");
			default:
				System.out.println("That was an invalid grade. Yoy must be in highschool.");}

	}

}
