import java.util.Scanner;
import javax.swing.JOptionPane;
public class c8 {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		char play;
		String play1;
		//stores what they want is a variable
		//comma to give it a title
		play1=JOptionPane.showInputDialog(null, "Do you want to play again?", "N", JOptionPane.ERROR_MESSAGE); 
		play1=play1.toUpperCase(); //while its a character. in if statement its a string
		play=play1.charAt(0);
		
		//System.out.println("Do you want to play again? (Y/N)");
		
		//play=console.next().charAt(0);
		//squiggles:
		if(play=='Y') 
		{
			JOptionPane.showMessageDialog(null, "Hooray");//null is center
			
			
		}
		else {
			JOptionPane.showMessageDialog(null, "BooHoo");
		}
		String wageStr;
		double wage;
		wageStr=JOptionPane.showInputDialog(null, "Enter your wage");
		wage=Double.parseDouble(wageStr); //gets unboxed into lower case doubles
		JOptionPane.showMessageDialog(null, wage*40);
		int dep;
		String depStr;
		depStr=JOptionPane.showInputDialog(null, "Enter the number of dependents: ");
		dep=Integer.parseInt(depStr); //changes string into integer like before with doulbe.
		//take away quotes that were around string. 
		int selection;
		selection=JOptionPane.showConfirmDialog(null, "Do you want to upgrade to first class?", "Title is here", JOptionPane.YES_NO_OPTION);
		System.out.println(selection);
		//choose what buttons to put on box. gets assigned into variable selection. each variable is a dif number.
		
		
	
	
	}

}
