import java.util.Scanner;

import javax.swing.JOptionPane;

public class C_console {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		String num1=JOptionPane.showInputDialog(null, "Please enter a number: "); 
		int num1d=Integer.parseInt(num1);
		String num2=JOptionPane.showInputDialog(null,"Please enter a second number: " );
		int num2d=Integer.parseInt(num2);
		int sum=num1d+num2d;
		int subtract=num1d-num2d;
		int product=num1d*num2d;
		int divided=num1d/num2d;
		int remainder=num1d%num2d;
		


		System.out.println("The first entry is "+num1d);
		System.out.println("The second entry is "+num2d);
		System.out.println(num1d+" plus "+num2d+" is "+sum);
		System.out.println(num1d+" minus "+num2d+" is "+subtract);
		System.out.println(num1d+" times "+num2d+" is "+product);
		System.out.println(num1d+" divided by "+num2d+" is "+divided);
		System.out.println("The remainder is "+remainder);
		
		
	}

}
