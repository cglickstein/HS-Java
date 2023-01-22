import java.util.Scanner;
public class B_currencyDenominations {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.print("Enter amount of money in dollars: ");
		int dollars= reader.nextInt();
		
		int twenties= (int) dollars/20;
		dollars=dollars-twenties*20;
		int tens= (int) dollars/10;
		dollars=dollars-tens*10;
		int fives= (int) dollars/5;	
		dollars=dollars-fives*5;
		int ones= (int) dollars;
		System.out.println("20-"+twenties);
		System.out.println("10-"+tens);
		System.out.println("5-"+fives);
		System.out.println("1-"+ones);
		
	}

}
