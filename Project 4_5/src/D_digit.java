import javax.swing.JOptionPane;
import java.util.Scanner;
public class D_digit {

	public static void main(String[] args) {
		String input=JOptionPane.showInputDialog(null, "Enter uppercase letter for telephone digit of the number: "); 
		input=input.toUpperCase();
		if((input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5") || input.equals("6") || input.equals("7") || input.equals("8") || input.equals("9") || input.equals("0") ))
		{
			System.out.println("INVALID INPUT");
			System.exit(0);
			}
		int digit=0;
		switch(input)
		{
		case "A":
		case "B":
		case "C":
			digit=2;
			System.out.println("digit is "+digit);
		case "D":
		case "E":
		case "F":
			digit=3;
			System.out.println("digit is "+digit);
		case "G":
		case "H":
		case "I":
			digit=4;
			
			System.out.println("digit is "+digit);
		case "J":
		case "K":
		case "L":
			digit=5;
			System.out.println("digit is "+digit);
		case "M":
		case "N":
		case "O":
			digit=6;
			System.out.println("digit is "+digit);
		case "P":
		case "Q":
		case "R":
			digit=7;
			System.out.println("digit is "+digit);
		case "S":
		case "T":
		case "U":
			digit=8;
			System.out.println("digit is "+digit);
		case "V":
		case "W":
		case "X":
		case "Y":
		case "Z":
			digit=9;
			System.out.println("digit is "+digit);

		}
	}

}
