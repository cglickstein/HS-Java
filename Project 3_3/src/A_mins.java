import java.util.Scanner;

public class A_mins {

	public static void main(String[] args) {
		Scanner reader= new Scanner (System.in);
		System.out.print("Enter mins worked on job: ");
		int mins= reader.nextInt();
		int hour= (int) mins/60;
		int minutes= (int) mins%60;
		System.out.println("Hours: "+hour);
		System.out.println("Minutes: "+ minutes);

	}

}
