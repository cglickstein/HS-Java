import java.util.Scanner;

import javax.swing.JOptionPane;

public class B_dialogBoxes {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String name;
		name=JOptionPane.showInputDialog(null, "Please enter your name: "); 
		String ageString;
		ageString=JOptionPane.showInputDialog(null, "Enter your age: ");
		String personality;
		personality=JOptionPane.showInputDialog(null, "Enter your personality: ");
		int age;
		age=Integer.parseInt(ageString);
		age=age+2;
		JOptionPane.showMessageDialog(null, name+", "+"you will be "+age+" in two years. You are "+personality+".");

		
		
	}

}
