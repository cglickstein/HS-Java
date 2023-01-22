import java.util.Scanner;

public class C_decimal {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Input five decimal numbers: ");
		double decimal1;
		double decimal2;
		double decimal3;
		double decimal4;
		double decimal5;
		decimal1=reader.nextDouble();
		decimal2=reader.nextDouble();
		decimal3=reader.nextDouble();
		decimal4=reader.nextDouble();
		decimal5=reader.nextDouble();
		

		System.out.println("The sum of these numbers is: "+(decimal1+decimal2+decimal3+decimal4+decimal5)+".");
		System.out.println("The average of these numbers is: "+(decimal1+decimal2+decimal3+decimal4+decimal5)/5+".");
	}

}

