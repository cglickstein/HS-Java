import javax.swing.JOptionPane;
import java.util.Random;

public class A_displayRandom {

	public static void main(String[] args) {
		Random generator=new Random(); //instantiating object
		int random;
		random=(generator.nextInt());
		JOptionPane.showMessageDialog(null, "The number is "+random+"!");

	}

}
